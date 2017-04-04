package com.baidu.exercise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Emiya on 2017/3/29.
 */

public class Demo12 {
    public static void main(String[] args) throws AgeOutOfBoundsException {
//        Demo();
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数：");

        while (true) {
            String line = sc.nextLine();
            try {
                int num = Integer.parseInt(line);
                System.out.println(Integer.toBinaryString(num));
                break;
            } catch (Exception e1) {
                try {
                    new BigInteger(line);
                    System.out.println("您录入的整数过大，请重新录入一个整数：");
                } catch (Exception e2) {
                    try {
                        new BigDecimal(line);
                        System.out.println("您录入的是一个小数，请重新录入一个整数：");
                    } catch (Exception e3) {
                        System.out.println("您录入的是一个非法字符，请重新录入一个整数：");
                    }
                }
            }

        }


    }

    public static void Demo() throws AgeOutOfBoundsException {
        int i = 0;
        if (i != 0) {
            System.out.println("haha ");
        } else {
            throw new AgeOutOfBoundsException("年龄非法");
        }
    }
}

class AgeOutOfBoundsException extends Exception {
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String s) {
        super(s);
    }


}