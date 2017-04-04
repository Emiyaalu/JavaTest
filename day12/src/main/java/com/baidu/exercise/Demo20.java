package com.baidu.exercise;

/**
 * Created by Emiya on 2017/4/1.
 */

public class Demo20 {
    public static void main(String[] args) {
        System.out.println(fun(8));
    }

    private static int fun(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return fun(num - 2) + fun(num - 1);
        }
    }


}
