package com.baidu.test;

import java.io.File;

/**
 * Created by Emiya on 2017/4/1.
 */

public class Test2 {
    public static void main(String[] args) {
        File dir = Test1.getDir();
        deleteFile(dir);

    }

    public static void deleteFile(File dir) {
        File[] subFiles = dir.listFiles();
        for (File subFile :
                subFiles) {
            if (subFile.isFile()) {
                subFile.delete();
            } else {
                deleteFile(subFile);
            }
        }
        dir.delete();
    }
}
