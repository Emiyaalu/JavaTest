package com.baidu.exercise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Emiya on 2017/4/1.
 */

public class Demo21 {
    public static void main(String[] args) {
//        Demo1();
//        System.out.println(fun(1000));
//        System.out.println(getLucklyNum(8));        //约瑟夫环
//        System.out.println(getLucklyNum(11));
//        System.out.println(getLucklyNum(12));
        MyTicket mt = new MyTicket();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
    }

    private static int getLucklyNum(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            list.add(i);
        }
        int count = 1;
        for (int i = 0; list.size() != 1; i++) {
            if (i == list.size()) {
                i = 0;
            }
            if (count % 3 == 0) {
                list.remove(i--);
            }
            count++;
        }
        return list.get(0);
    }


    private static int fun(int num) {
        if (num > 0 && num < 5) {
            return 0;
        }
        return num / 5 + fun(num / 5);
    }

    public static void Demo1() {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= 1000; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        System.out.println(result);
        String str = result.toString();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('0' == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
        int count2 = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if ('0' != str.charAt(i)) {
                break;
            } else {
                count2++;
            }
        }
        System.out.println(count2);
    }
}

class MyTicket implements Runnable {
    private int ticket = 1000;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"这是第"+ticket--+"号票。");
            }
        }
    }
}