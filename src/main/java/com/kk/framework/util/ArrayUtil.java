package com.kk.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author: fkxia
 * @description 数组工具类
 * @date: 2023/9/25 22:35
 */
public final class ArrayUtil {

    /**
     * 判断数组是否为空
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }

    /**
     * 判断数组是否非空
     */
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }
}
