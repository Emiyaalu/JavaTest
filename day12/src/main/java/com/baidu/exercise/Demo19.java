package com.baidu.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by Emiya on 2017/3/31.
 */

public class Demo19 {
    public static void main(String[] args) throws IOException {
//        Demo1();
        Properties prop = new Properties();
        prop.load(new FileInputStream("G:\\config.properties"));
        prop.setProperty("tel", "18721293527");
        prop.store(new FileOutputStream("G:\\config.properties"),"Emiya" );
        System.out.println(prop);
    }

    public static void Demo1() {
        Properties prop = new Properties();
        prop.put("name", "张三");
        prop.put("tel", "18329736957");

        Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
        while (en.hasMoreElements()) {
            String key = en.nextElement();
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
