package com.baidu.exercise;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Emiya on 2017/3/31.
 */

public class Demo16 {
    public static void main(String[] args) {
        File dir = getDir();
        printJavaFile(dir);

    }

    public static void printJavaFile(File dir) {
        File[] subfiles = dir.listFiles();
        for (File subFile : subfiles) {
            if (subFile.isFile() && subFile.getName().endsWith(".java")) {
                System.out.println(subFile);
            } else if (subFile.isDirectory()) {
                printJavaFile(subFile);
            }
        }
    }

    public static File getDir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        while (true) {
            File dir = new File(sc.nextLine());
            if (!dir.exists()) {
                System.out.println("您输入的路径错误，请重新输入：");
            } else if (dir.isFile()) {
                System.out.println("您输入的是文件路径,请输入一个文件夹路径");
            } else {
                return dir;
            }
        }
    }

    public static int fun(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * fun(num - 1);
        }

    }
}
