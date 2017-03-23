package com.baidu.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Emiya on 2017/3/23.
 */

public class Demo3 {
    public static void main(String[] args) {

        String s = "91 27 46 38 50";
        String regex = " ";
        String[] arr = s.split(regex);
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

}
