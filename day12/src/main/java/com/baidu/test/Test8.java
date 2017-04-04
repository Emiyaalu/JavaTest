package com.baidu.test;

import com.baidu.bean.Person;
import com.baidu.bean.Student;

/**
 * Created by Emiya on 2017/4/3.
 */

public class Test8 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student s = new Student("张三",23);
        System.out.println(s);

        Tool t = new Tool();
        t.setProperty(s,"name","李四");
        System.out.println(s);
    }
}
