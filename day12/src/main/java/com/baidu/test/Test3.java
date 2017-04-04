package com.baidu.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Emiya on 2017/4/1.
 */

public class Test3 {
    public static void main(String[] args) throws IOException {
        File src = Test1.getDir();
        File dest = Test1.getDir();
        if (src.equals(dest)) {
            System.out.println("目标文件夹是源文件夹的子文件夹");
        } else {
            copy(src, dest);
        }

    }

    private static void copy(File src, File dest) throws IOException {
        File newDir = new File(dest, src.getName());
        newDir.mkdir();
        File[] subFiles = src.listFiles();
        for (File subFile :
                subFiles) {
            if (subFile.isFile()) {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subFile));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(newDir, subFile.getName())));
                int b;
                while ((b = bis.read()) != -1) {
                    bos.write(b);
                }
                bis.close();
                bos.close();
            } else {
                copy(subFile, newDir);
            }
        }
    }
}
