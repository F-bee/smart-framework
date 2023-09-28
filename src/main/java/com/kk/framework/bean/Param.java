package com.kk.framework.bean;

import com.kk.framework.util.CastUtil;

import java.util.Map;

/**
 * @author: fkxia
 * @description 请求参数对象
 * @date: 2023/9/28 21:37
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 根据参数名获取 long 型参数值
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取所有字段信息
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }
}
