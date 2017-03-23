package com.baidu.scanner;


import java.util.Scanner;

/**
 * Created by Emiya on 2017/3/21.
 */

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        String s1 = "";
        for (int i = arr.length - 1;i >= 0; i--) {
            s1 += arr[i];
        }
        System.out.println(s1);

    }

}
