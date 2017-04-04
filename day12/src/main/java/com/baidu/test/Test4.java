package com.baidu.test;

import java.io.File;

/**
 * Created by Emiya on 2017/4/1.
 */

public class Test4 {
    public static void main(String[] args) {
        File dir = Test1.getDir();
        printLev(dir, 0);

    }

    private static void printLev(File dir, int lev) {
        File[] subFiles = dir.listFiles();

        for (File subfile :
                subFiles) {
            for (int i = 0; i < lev; i++) {
                System.out.print("\t");
            }

            System.out.println(subfile.getName());

            if (subfile.isDirectory()) {
                printLev(subfile, lev + 1);
            }
        }

    }
}

