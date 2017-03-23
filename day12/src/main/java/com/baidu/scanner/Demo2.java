package com.baidu.scanner;

/**
 * Created by Emiya on 2017/3/21.
 */

public class Demo2 {
    public static void main(String[] args) {
        String s = "ABCDEabcd123456!@#$%^";
        int num = 0;
        int big = 0;
        int small = 0;
        int symbol = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num++;
            } else if (c >= 'a' && c <= 'z') {
                small++;
            } else if (c >= 'A' && c <= 'Z') {
                big++;
            } else {
                symbol++;
            }
        }
        System.out.println("大写字母" + big + "个，小写字母" + small
                + "个，数字" + num + "个，符号" + symbol + "个");

    }

}
