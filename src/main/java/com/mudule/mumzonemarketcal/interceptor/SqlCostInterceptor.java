package com.mudule.mumzonemarketcal.interceptor;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Statement;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.mudule.mumzonemarketcal.enums.JoinValuesEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.defaults.DefaultSqlSession.StrictMap;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Intercepts(value = {
        @Signature(args = {Statement.class, ResultHandler.class}, method = "query", type = StatementHandler.class),
        @Signature(args = {Statement.class}, method = "update", type = StatementHandler.class),
        @Signature(args = {Statement.class}, method = "batch", type = StatementHandler.class),
       })
public class SqlCostInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object target = invocation.getTarget();
        long startTime = System.currentTimeMillis();
        StatementHandler statementHandler = (StatementHandler) target;
        try {
            return invocation.proceed();
        } finally {
            long endTime = System.currentTimeMillis();
            long sqlCost = endTime - startTime;
            BoundSql boundSql = statementHandler.getBoundSql();
            String sql = boundSql.getSql();
            Object parameterObject = boundSql.getParameterObject();
            List<ParameterMapping> parameterMappingList = boundSql.getParameterMappings();
            // 格式化Sql语句，去除换行符，替换参数
            sql = formatSql(sql, parameterObject, parameterMappingList);
            log.info("\n执行SQL===========================>分析:\nEXECUTOR——>SQL:\n【" + sql + "】\n执行耗时【" + sqlCost + "ms】");
        }
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }

    /**
     * 格式化SQL
     * @param sql
     * @param parameterObject
     * @param parameterMappingList
     * @return
     */
    private String formatSql(String sql, Object parameterObject, List<ParameterMapping> parameterMappingList) {
        /**
         * 判断SQL
         */
        if (sql == "" || sql.length() == 0) {
            return "";
        }
        /**
         * 格式化SQL
         */
        sql = beautifySql(sql);
        /**
         * 不传参数的场景，直接把Sql美化一下返回出去
         */
        if (parameterObject == null || parameterMappingList == null || parameterMappingList.size() == 0) {
            return sql;
        }
        /**
         *定义一个没有替换过占位符的sql，用于出异常时返回
         */
        String sqlWithoutReplacePlaceholder = sql;
        try {
            if (parameterMappingList != null) {
                Class<?> parameterObjectClass = parameterObject.getClass();
                /**
                 * 如果参数是StrictMap且Value类型为Collection，获取key="list"的属性，这里主要是为了处理<foreach>循环时传入List这种参数的占位符替换
                 * 例如select * from xxx where id in <foreach
                 *        collection="list">...</foreach>
                 */
                if (isStrictMap(parameterObjectClass)) {
                    StrictMap<Collection<?>> strictMap = (StrictMap<Collection<?>>) parameterObject;
                    if (isList(strictMap.get(JoinValuesEnum.LIST.getValue()).getClass())) {
                        sql = handleListParameter(sql, strictMap.get(JoinValuesEnum.LIST.getValue()));
                    }
                } else if (isMap(parameterObjectClass)) {
                    /**
                     * 如果参数是Map则直接强转，通过map.get(key)方法获取真正的属性值
                     * 这里主要是为了处理<insert>、<delete>、<update>、<select>时传入parameterType为map的场景
                      */
                    Map<?, ?> paramMap = (Map<?, ?>) parameterObject;
                    sql = handleMapParameter(sql, paramMap, parameterMappingList);
                } else {
                    /**
                     * 通用场景，比如传的是一个自定义的对象或者八种基本数据类型之一或者String
                     */
                    sql = handleCommonParameter(sql, parameterMappingList, parameterObjectClass, parameterObject);
                }
            }
        } catch (Exception e) {
            /**
             *  占位符替换过程中出现异常，则返回没有替换过占位符但是格式化的sql，这样至少保证sql语句比BoundSql中的sql更好看
             */
            return sqlWithoutReplacePlaceholder;
        }
        return sql;
    }

    /**
     * 处理比较常用的场景
     * @param sql
     * @param parameterMappingList
     * @param parameterObjectClass
     * @param parameterObject
     * @return
     * @throws Exception
     */
    private String handleCommonParameter(String sql, List<ParameterMapping> parameterMappingList,
                                         Class<?> parameterObjectClass, Object parameterObject) throws Exception {
        for (ParameterMapping parameterMapping : parameterMappingList) {
            String propertyValue = null;
            /**
             * 基本数据类型或者基本数据类型的包装类，
             * 直接toString即可获取其真正的参数值，
             * 其余直接取paramterMapping中的property属性即可
             */
            if (isPrimitiveOrPrimitiveWrapper(parameterObjectClass)) {
                propertyValue = parameterObject.toString();
            } else {
                String propertyName = parameterMapping.getProperty();
                Field field = parameterObjectClass.getDeclaredField(propertyName);
                /**
                 * 要获取Field中的属性值，这里必须将私有属性的accessible设置为true
                 */
                field.setAccessible(true);
                propertyValue = String.valueOf(field.get(parameterObject));
                if (parameterMapping.getJavaType().isAssignableFrom(String.class)) {
                    propertyValue = "\"" + propertyValue + "\"";
                }
            }
            sql = sql.replaceFirst("\\?", propertyValue);
        }
        return sql;
    }

    /**
     * 处理Map集合 将？转为具体的数值
     * @param sql
     * @param paramMap
     * @param parameterMappingList
     * @return
     */
    private String handleMapParameter(String sql, Map<?, ?> paramMap, List<ParameterMapping> parameterMappingList) {
        for (ParameterMapping parameterMapping : parameterMappingList) {
            Object propertyName = parameterMapping.getProperty();
            Object propertyValue = paramMap.get(propertyName);
            if (propertyValue != null) {
                if (propertyValue.getClass().isAssignableFrom(String.class)) {
                    propertyValue = "\"" + propertyValue + "\"";
                }
                sql = sql.replaceFirst("\\?", propertyValue.toString());
            }
        }
        return sql;
    }

    /**
     * 处理List集合 将？转为具体的数值
     * @param sql
     * @param col
     * @return
     */
    private String handleListParameter(String sql, Collection<?> col) {
        if (col != null && col.size() != 0) {
            for (Object obj : col) {
                String value = null;
                Class<?> objClass = obj.getClass();
                // 只处理基本数据类型、基本数据类型的包装类、String这三种
                // 如果是复合类型也是可以的，不过复杂点且这种场景较少，
                // 写代码的时候要判断一下要拿到的是复合类型中的哪个属性
                if (isPrimitiveOrPrimitiveWrapper(objClass)) {
                    value = obj.toString();
                } else if (objClass.isAssignableFrom(String.class)) {
                    value = "\"" + obj.toString() + "\"";
                }
                sql = sql.replaceFirst("\\?", value);
            }
        }
        return sql;
    }

    /**
     * 处理sql格式
     * @param sql
     * @return
     */
    private String beautifySql(String sql) {
        // sql = sql.replace("\n", "").replace("\t", "").replace(" ", "
        // ").replace("( ", "(").replace(" )", ")").replace(" ,", ",");
        sql = sql.replaceAll("[\\s\n ]+", " ");
        return sql;
    }

    /**
     * 是否是基本数据类型或者是基本数据类型的包装类
     * @param parameterObjectClass
     * @return
     */
    private boolean isPrimitiveOrPrimitiveWrapper(Class<?> parameterObjectClass) {
        return parameterObjectClass.isPrimitive()
                || (parameterObjectClass.isAssignableFrom(Byte.class)
                || parameterObjectClass.isAssignableFrom(Short.class)
                || parameterObjectClass.isAssignableFrom(Integer.class)
                || parameterObjectClass.isAssignableFrom(Long.class)
                || parameterObjectClass.isAssignableFrom(Double.class)
                || parameterObjectClass.isAssignableFrom(Float.class)
                || parameterObjectClass.isAssignableFrom(Character.class)
                || parameterObjectClass.isAssignableFrom(Boolean.class)
                || parameterObjectClass.isAssignableFrom(String.class)
                || parameterObjectClass.isAssignableFrom(BigDecimal.class));
    }

    /**
     * 是否是DefaultSqlSession的内部类型StrictMap
     * @param parameterObjectClass
     * @return
     */
    private boolean isStrictMap(Class<?> parameterObjectClass) {
        return parameterObjectClass.isAssignableFrom(StrictMap.class);
    }

    /**
     * 判断是否是list实现类
     * @param clazz
     * @return
     */
    private boolean isList(Class<?> clazz) {
        Class<?>[] interfaceClasses = clazz.getInterfaces();
        for (Class<?> interfaceClass : interfaceClasses) {
            if (interfaceClass.isAssignableFrom(List.class)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断是否是Map的实现类
     * @param parameterObjectClass
     * @return
     */
    private boolean isMap(Class<?> parameterObjectClass) {
        Class<?>[] interfaceClasses = parameterObjectClass.getInterfaces();
        for (Class<?> interfaceClass : interfaceClasses) {
            if (interfaceClass.isAssignableFrom(Map.class)) {
                return true;
            }
        }
        return false;
    }

}
