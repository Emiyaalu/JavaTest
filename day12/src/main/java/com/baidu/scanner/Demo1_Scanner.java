package com.baidu.scanner;

import java.util.Scanner;

/**
 * Created by Emiya on 2017/3/21.
 */

public class Demo1_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 3; i > 0; ) {
            System.out.println("请输入账号：");
            String id = sc.nextLine();
            System.out.println("请输入密码：");
            String pw = sc.nextLine();
            if ("admin".equals(id) && "admin".equals(pw)) {
                System.out.println("登入成功！");
                break;
            } else {
                i--;
                if (i > 0) {
                    System.out.println("登录失败，请重新登录，还有" + i + "次机会。");
                } else {
                    System.out.println("登入失败，今天次数已用完，请明天再试。");
                }
            }
        }

    }


}
