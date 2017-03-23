package com.baidu.exercise;

import java.util.Calendar;

import sun.misc.Cleaner;

/**
 * Created by Emiya on 2017/3/23.
 */

public class Demo7 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String s = c.get(Calendar.YEAR) + "年"
                + getNum(c.get(Calendar.MONTH) + 1) + "月"
                + getNum(c.get(Calendar.DAY_OF_MONTH)) + "日"
                + getWeek(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(s);
    }

    public static String getNum(int num) {
        return num < 9 ? "0" + num : "" + num;
    }

    public static String getWeek(int week) {
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return arr[week];
    }

}
