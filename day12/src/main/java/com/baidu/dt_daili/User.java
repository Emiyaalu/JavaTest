package com.baidu.dt_daili;

/**
 * Created by Emiya on 2017/4/3.
 */

public interface User {
    public void add();

    public void delete();

    public default void print() {
        System.out.println("default在借口中定义方法");
    }

    public static void fun() {
        System.out.println("接口中的静态方法");
    }

}
