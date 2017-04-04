package com.baidu.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


/**
 * Created by Emiya on 2017/4/2.
 */

public class UpDate_Client {
    public static void main(String[] args) throws IOException {
        File file = getFile();
        Socket socket = new Socket("127.0.0.1",12343);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream ps = new PrintStream(socket.getOutputStream());
        ps.println(file.getName());
        String result = br.readLine();
        if ("存在".equals(result)) {
            System.out.println("您上传的文件已经存在，请不要重复上传。");
            socket.close();
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        byte[] arr = new byte[8192];
        int len = arr.length;
        while ((len = fis.read(arr)) != -1) {
            ps.write(arr,0,len);
        }

        fis.close();
        socket.close();

    }

    public static File getFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件路径：");
        while (true) {
            File file = new File(sc.nextLine());
            if (!file.exists()) {
                System.out.println("您输入的路径错误，请重新输入：");
            } else if (file.isDirectory()) {
                System.out.println("您输入的是一个文件夹路径，请输入一个文件路径：");
            } else {
                return file;
            }
        }
    }
}
