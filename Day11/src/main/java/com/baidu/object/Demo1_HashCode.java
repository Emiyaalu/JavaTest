package com.baidu.object;

import com.baidu.bean.Student;

/**
 * Created by Emiya on 2017/3/20.
 */

public class Demo1_HashCode {
    public static void main(String[] args) {
        Object obj1 = new Object();
        int hashCode = obj1.hashCode();
        System.out.println(hashCode);

        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",24);

        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());


    }

}
