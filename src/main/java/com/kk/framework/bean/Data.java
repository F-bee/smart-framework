package com.kk.framework.bean;

/**
 * @author: fkxia
 * @description 返回数据对象
 * @date: 2023/9/28 21:44
 */
public class Data {

    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}
