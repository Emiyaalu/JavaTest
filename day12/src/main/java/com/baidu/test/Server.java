package com.baidu.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Emiya on 2017/4/2.
 */

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(54322);
        System.out.println("服务器启动，绑定54322端口。");
        while (true) {
            final Socket socket = server.accept();

            new Thread() {
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        PrintStream ps = new PrintStream(socket.getOutputStream());

                        String line = br.readLine();
                        line = new StringBuilder(line).reverse().toString();
                        ps.println(line);

                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
