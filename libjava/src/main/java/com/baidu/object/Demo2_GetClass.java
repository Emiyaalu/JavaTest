package com.baidu.object;

import com.baidu.bean.Student;

/**
 * Created by Emiya on 2017/3/20.
 */

public class Demo2_GetClass {
    public static void main(String[] args) {
        Student s = new Student("张三",23);
        Class clazz = s.getClass();
        String name = clazz.getName();
        System.out.println(name);
    }
}
