package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Emiya on 2017/4/3.
 */

public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        BufferedReader br = new BufferedReader(new FileReader("config.properties"));
        Class clazz = Class.forName(br.readLine());
        DemoClass dc = (DemoClass) clazz.newInstance();
        dc.run();

//        Method m = clazz.getMethod("run");
//        m.invoke(dc);


    }
}
