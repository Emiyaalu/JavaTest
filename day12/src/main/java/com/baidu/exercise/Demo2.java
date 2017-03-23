package com.baidu.exercise;

/**
 * Created by Emiya on 2017/3/22.
 */

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {55, 66, 33, 77, 11, 67, 23};
        print(arr);
//        bubbleSort(arr);
        selectSort(arr);
        print(arr);
        int num = binarySearch(arr, 77);
        System.out.println(num);
    }

    public static int binarySearch(int[] arr, int a) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;
        while (max >= min) {
            if (arr[mid] < a) {
                min = mid + 1;
                mid = (min + max) / 2;
            } else if (arr[mid] > a) {
                max = max - 1;
                mid = (min + max) / 2;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }

    public static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }

    public static void change(String s) {
        s += "itcast";
    }

}
