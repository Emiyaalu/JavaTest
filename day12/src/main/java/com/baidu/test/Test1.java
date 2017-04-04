package com.baidu.test;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Emiya on 2017/3/31.
 */

public class Test1 {
    public static void main(String[] args) {
        File dir = getDir();
        System.out.println(getFileLenth(dir));
    }

    private static long getFileLenth(File dir) {
        long length = 0;
        File[] subFiles = dir.listFiles();
        for (File subfile :
                subFiles) {
            if (subfile.isFile()) {
                length += subfile.length();
            } else {
                length += getFileLenth(subfile);
            }
        }
        return length;
    }

    public static File getDir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        while (true) {
            File dir = new File(sc.nextLine());
            if (!dir.exists()) {
                System.out.println("您输入的路径错误，请重新输入：");
            } else if (dir.isFile()) {
                System.out.println("您输入的是一个文件路径，请重新输入一个文件夹路径：");
            } else {
                return dir;
            }

        }
    }
}
