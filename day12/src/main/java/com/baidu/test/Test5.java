package com.baidu.test;

import com.baidu.bean.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Emiya on 2017/4/3.
 */

public class Test5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        BufferedReader br = new BufferedReader(new FileReader("config.properties"));
        Class clazz = Class.forName(br.readLine());
        Constructor c = clazz.getConstructor(String.class,int.class);
        Person p = (Person) c.newInstance("张三",23);
//        Field f = clazz.getField("name");
        Field f = clazz.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p,"李四");
        System.out.println(p);
    }
}
