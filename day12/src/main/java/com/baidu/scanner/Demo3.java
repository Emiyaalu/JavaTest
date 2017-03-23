package com.baidu.scanner;

import com.baidu.bean.Person;

/**
 * Created by Emiya on 2017/3/21.
 */

public class Demo3 {
    public static void main(String[] args) {
//        String s = "woaiHEIMAniaima";
//        String s1 = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
//        System.out.println(s1);
        int arr[] = {1,2,3};
        System.out.print("[");
        for (int i = 0;i < arr.length;i++) {

            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
        String s = "[";
        for (int i = 0;i < arr.length;i++) {
            if (i != arr.length - 1) {
                s += arr[i] + ", " ;
            } else {
                s += arr[i] + "]";
            }
        }
        System.out.println(s);

    }

}
