package com.mudule.mumzonemarketcal.utils;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Description 排序工具类
 * @ClassName SortUtil
 * @Autor DZT
 * @Date 2019/9/26 15:28
 * @Version 1.0
 */
public class SortUtil {
    /**
     * 使用 Map按key进行排序
     *
     * @param map
     * @return
     */
    public static Map<String, String> sortMapByKey(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        Map<String, String> sortMap = new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        sortMap.putAll(map);
        return sortMap;
    }
}
