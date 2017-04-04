package com.baidu.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Emiya on 2017/3/31.
 */

public class Demo15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("G:\\time.txt"));
        String line = br.readLine();
        int times = Integer.parseInt(line);
        if (times > 0) {
            System.out.println("试用次数还有" + times-- + "次");
            BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\time.txt"));
            bw.write(times + "");
            bw.close();
        } else {
            System.out.println("试用次数已用完，请使用正式版本。");
        }
        br.close();
    }
}
