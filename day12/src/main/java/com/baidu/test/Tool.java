package com.baidu.test;

import java.lang.reflect.Field;

/**
 * Created by Emiya on 2017/4/3.
 */

public class Tool {
    public void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Class clazz = obj.getClass();
        clazz = clazz.getSuperclass();
        Field f = clazz.getDeclaredField(propertyName);
        f.setAccessible(true);
        f.set(obj,value);

    }
}
