package com.baidu.exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Emiya on 2017/3/23.
 */

public class Demo6 {
    public static void main(String[] args) throws ParseException {
        String str = "2008年08月08日 23:45:23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = sdf.parse(str);
        System.out.println(d);

        String s1 = "1991年10月15日";
        String s2 = "2017年03月23日";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthday = sdf2.parse(s1);
        Date today = sdf2.parse(s2);
        long l = today.getTime() - birthday.getTime();
        long time = l / 1000 / 60 / 60 / 24;
        System.out.println("我来到这个世界已经" + time + "天了，今年" + time / 360 + "岁");
    }
}
