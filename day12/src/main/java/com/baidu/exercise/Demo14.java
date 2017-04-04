package com.baidu.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Emiya on 2017/3/30.
 */

public class Demo14 {
    public static void main(String[] args) throws IOException {
//        Demo1();
//        Demo2();
//        Demo3();
        System.out.println("开始");
        BufferedReader br = new BufferedReader(new FileReader("G:\\test.txt"));
        TreeMap<Character, Integer> tm = new TreeMap<>();

        int ch;
        while ((ch = br.read()) != -1) {
            char c = (char) ch;
            tm.put(c, !tm.containsKey(c) ? 0 : tm.get(c) + 1);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\time.txt"));
        for (Map.Entry<Character, Integer> en :
                tm.entrySet()) {
            switch (en.getKey()) {
                case '\t':
                    bw.write("\\t=" + en.getValue());
                    break;
                case '\r':
                    bw.write("\\r=" + en.getValue());
                    break;
                case '\n':
                    bw.write("\\n=" + en.getValue());
                    break;
                default:
                    bw.write(en.getKey() + "=" + en.getValue());
                    break;
            }
            bw.newLine();

        }
        bw.close();
        System.out.println("完毕");
    }

    public static void Demo3() throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("G:\\test.txt"));
        lnr.setLineNumber(100);
        String line;
        while ((line = lnr.readLine()) != null) {
            System.out.println(lnr.getLineNumber() + " " + line);
        }

        lnr.close();
    }


    public static void Demo2() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("G:\\test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\copy.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            bw.write(list.get(i));
            bw.newLine();
        }
        br.close();
        bw.close();
    }

    public static void Demo1() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要录入的内容，quit退出");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("G:\\test.txt"));
        while (true) {
            String line = sc.nextLine();
            if ("quit".equals(line)) {
                break;
            }
            bos.write((line + "\r\n").getBytes());
        }
        bos.close();
    }
}
