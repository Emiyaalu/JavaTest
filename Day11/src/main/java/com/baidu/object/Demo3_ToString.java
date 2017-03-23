package com.baidu.object;

import com.baidu.bean.Student;

/**
 * Created by Emiya on 2017/3/20.
 */

public class Demo3_ToString {
    public static void main(String[] args) {
        Student s = new Student("张三",23);
        String str = s.toString();
        System.out.println(str);
        System.out.println(s);  //直接打印对象的引用，默认调用toString（）方法。
    }


}
