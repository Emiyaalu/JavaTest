package com.baidu.exercise;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Emiya on 2017/3/23.
 */

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        String line = sc.nextLine();
        int year = Integer.parseInt(line);
        boolean b = getYear(sc, year);
        if (b) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "是平年");
        }
    }

    public static boolean getYear(Scanner sc, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        return c.get(Calendar.DAY_OF_MONTH) == 29 ? true : false;
    }
}
