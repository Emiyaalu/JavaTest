package com.baidu.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Emiya on 2017/3/29.
 */

public class Demo13 {
    public static void main(String[] args) throws IOException {

//        Demo1();
        File file = getFile();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("G:\\" + file.getName()));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        bis.close();
        bos.close();

    }

    public static void Demo1() throws IOException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("D:\\鬼刀.jpg"));
            bos = new BufferedOutputStream(new FileOutputStream("G:\\Copy.jpg"));

            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
            } finally {
                if (bos != null) {
                    bos.close();
                }
            }
        }
    }


    public static File getFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要拷贝的文件路径：");
        while (true) {
            File file = new File(sc.nextLine());
            if (!file.exists()) {
                System.out.println("您输入的是一个错误的路径，请重新输入：");
            } else if (file.isDirectory()) {
                System.out.println("您输入的是一个文件夹路径，请重新输入一个文件路径：");
            } else {
                return file;
            }

        }

    }
}
