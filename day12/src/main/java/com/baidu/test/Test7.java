package com.baidu.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Emiya on 2017/4/3.
 */

public class Test7 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);

        Class clazz = Class.forName("java.util.ArrayList");
        Method m = clazz.getMethod("add",Object.class);
        m.invoke(list, "越狱");
        System.out.println(list);
    }
}
