package com.baidu.exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Emiya on 2017/3/23.
 */

public class Demo6 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日,格式yyyy.MM.dd");
        String s1 = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        String s2 = sdf.format(new Date());
        Date birthday = sdf.parse(s1);
        Date today = sdf.parse(s2);
        long l = today.getTime() - birthday.getTime();
        long time = l / 1000 / 60 / 60 / 24;
        System.out.println("你来到这个世界已经" + time + "天了，今年" + time / 360 + "岁");
    }
}
