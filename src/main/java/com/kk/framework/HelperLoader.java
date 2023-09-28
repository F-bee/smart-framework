package com.kk.framework;

import com.kk.framework.helper.BeanHelper;
import com.kk.framework.helper.ClassHelper;
import com.kk.framework.helper.ControllerHelper;
import com.kk.framework.helper.IocHelper;
import com.kk.framework.util.ClassUtil;

/**
 * @author: fkxia
 * @description 加载相应的 Helper 类
 * @date: 2023/9/28 21:23
 */
public final class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
