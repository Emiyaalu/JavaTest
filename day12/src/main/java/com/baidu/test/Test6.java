package com.baidu.test;

import com.baidu.bean.Person;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Emiya on 2017/4/3.
 */

public class Test6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        BufferedReader br = new BufferedReader(new FileReader("config.properties"));
        Class clazz = Class.forName(br.readLine());
        Constructor c = clazz.getConstructor(String.class, int.class);
        Person p = (Person) c.newInstance("张三",23);
        Method m = clazz.getMethod("eat");
        m.invoke(p);
        Method m2 = clazz.getMethod("eat",int.class);
        m2.invoke(p, 10);

    }
}
