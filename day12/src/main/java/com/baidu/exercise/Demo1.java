package com.baidu.exercise;

import java.util.Scanner;

/**
 * Created by Emiya on 2017/3/22.
 */

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        StringBuffer sb = revString(line);
        System.out.println(sb);


    }

    public static StringBuffer revString(String line) {
        StringBuffer sb = new StringBuffer(line);
        sb.reverse();
        return sb;
    }

    public static StringBuffer arrayToString(int[] arr) {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < arr.length; i++) {

            if (i != arr.length - 1) {
                sb.append(arr[i] + ", ");
            } else {
                sb.append(arr[i] + "]");
            }
        }
        return sb;
    }


}
