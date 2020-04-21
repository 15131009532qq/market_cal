package com.mudule.mumzonemarketcal.utils;


import com.alibaba.fastjson.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * 类型处理工具
 *
 * @author qi_grui
 */
public class StringUtils {


    /**
     * 判断对象空
     *
     * @param obj
     * @return
     */
    public static boolean isEmpty(Object obj) {
        if (obj instanceof List) {
            return isListEmpty((List) obj);
        }
        return obj == null || "".equals(obj) || "null".equals(obj);
    }

    /**
     * 判断对象非空
     *
     * @param obj
     * @return
     */
    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    /**
     * 判读list集合空
     *
     * @param list
     * @return
     */
    public static boolean isListEmpty(List list) {
        return list == null || list.isEmpty();
    }

    /**
     * 判断BigDecimal类型值是否不同
     *
     * @param expected
     * @param actual
     * @return
     */
    public static boolean bigDecimalIsDifferent(BigDecimal expected, BigDecimal actual) {
        return expected.compareTo(actual) == 0;
    }

    /**
     * 判读字符串的最大长度
     *
     * @param str
     * @param length
     * @return
     */
    public static boolean stringMax(String str, int length) {
        if (isEmpty(str) || str.length() > length) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 设置json中null的字段为空串
     *
     * @param json
     * @param keys
     * @return
     */
    public static JSONObject setJsonNullToEmpty(JSONObject json, String[] keys) {
        for (String key : keys) {
            if (StringUtils.isEmpty(json.get(key))) {
                json.put(key, "");
            }
        }
        return json;
    }

    /**
     * 使用zip进行压缩
     *
     * @param str 压缩前的文本
     * @return 返回压缩后的文本
     */
    public static final String zip(String str) {
        if (str == null){
            return null;}
        byte[] compressed;
        ByteArrayOutputStream out = null;
        ZipOutputStream zout = null;
        String compressedStr = null;
        try {
            out = new ByteArrayOutputStream();
            zout = new ZipOutputStream(out);
            zout.putNextEntry(new ZipEntry("0"));
            zout.write(str.getBytes());
            zout.closeEntry();
            compressed = out.toByteArray();
            compressedStr = new sun.misc.BASE64Encoder().encodeBuffer(compressed);
        } catch (IOException e) {
            compressed = null;
        } finally {
            if (zout != null) {
                try {
                    zout.close();
                } catch (IOException e) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
        }
        return compressedStr;
    }

    /**
     * 使用zip进行解压缩
     *
     * @param compressedStr 压缩后的文本
     * @return 解压后的字符串
     */
    public static final String unzip(String compressedStr) {
        if (compressedStr == null) {
            return null;
        }

        ByteArrayOutputStream out = null;
        ByteArrayInputStream in = null;
        ZipInputStream zin = null;
        String decompressed = null;
        try {
            byte[] compressed = new sun.misc.BASE64Decoder().decodeBuffer(compressedStr);
            out = new ByteArrayOutputStream();
            in = new ByteArrayInputStream(compressed);
            zin = new ZipInputStream(in);
            zin.getNextEntry();
            byte[] buffer = new byte[1024];
            int offset = -1;
            while ((offset = zin.read(buffer)) != -1) {
                out.write(buffer, 0, offset);
            }
            decompressed = out.toString();
        } catch (IOException e) {
            decompressed = null;
        } finally {
            if (zin != null) {
                try {
                    zin.close();
                } catch (IOException e) {
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
        }
        return decompressed;
    }

    public static List<String> getListByStringSplit(String strings, String split) {
        if (strings != null && !"".equals(strings)) {
            String[] sp = strings.split(split);
            List<String> list = new ArrayList<>();
            for (String s : sp) {
                list.add(s);
            }
            return list;
        } else {
            return null;
        }
    }

    public static List<Integer> getListIntByStringSplit(String strings, String split) {
        if (strings != null && !"".equals(strings)) {
            String[] sp = strings.split(split);
            List<Integer> list = new ArrayList<Integer>();
            for (String s : sp) {
                list.add(Integer.parseInt(s));
            }
            return list;
        } else {
            return null;
        }
    }

    public static String getAnonymousName(String name) {
        if (isEmpty(name)) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        sb.append(name.substring(0, 1));
        sb.append("**");
        return sb.toString();
    }

    /**
     * 获取请求参数的map
     *
     * @return
     */
    public static Map<String, String> getRequestParams(String params) {
        Map<String, String> map = new HashMap<>();
        if (isEmpty(params)) {
            return null;
        }
        String[] arr = params.split("&");
        for (String param : arr) {
            String[] str = param.split("=");
            map.put(str[0], str[1]);
        }
        return map;
    }

    /**
     * 转化数据
     *
     * @param str
     * @return
     */
    public static Map<String, String> mapStringToJSONObject(String str) {
        Map<String, String> map = new HashMap<>();
        str = str.substring(1, str.length() - 1);
        String[] strs = str.split(",");
        for (String string : strs) {
            String key = string.split("=")[0];
            String trim = key.trim();
            String value = string.split("=")[1];
            map.put(trim, value);
        }
        return map;
    }
}
