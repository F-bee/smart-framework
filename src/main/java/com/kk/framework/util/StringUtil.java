package com.kk.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author: fkxia
 * @description 字符串工具类
 * @date: 2023/9/24 1:35
 */
public final class StringUtil {

    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
