package com.baidu.exercise;

/**
 * Created by Emiya on 2017/3/23.
 */

public class Demo4 {
    public static void main(String[] args) {
        String s = "我..我我我..要要要要..要学..学学编..编编程..程程.";
        String s2 = s.replaceAll("\\.", "");
        String s3 = s2.replaceAll("(.)\\1+", "$1");
        System.out.println(s3);
    }
}
