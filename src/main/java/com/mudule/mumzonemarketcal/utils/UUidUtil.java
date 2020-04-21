package com.mudule.mumzonemarketcal.utils;

import java.util.UUID;

/**
 * @author qi_grui
 */
public class UUidUtil {

    /**
     * 生成全局唯一ID
     *
     * @return
     */
    public static String generateId() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
