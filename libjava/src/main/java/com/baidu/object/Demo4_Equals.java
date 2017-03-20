package com.baidu.object;

import com.baidu.bean.Student;

/**
 * Created by Emiya on 2017/3/21.
 */

public class Demo4_Equals {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23);
        Student s2 = new Student("张三",23);
        boolean b = s1.equals(s2);
        System.out.println(s1 == s2);
        System.out.println(b);
    }


}
