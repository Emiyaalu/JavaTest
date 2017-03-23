package com.baidu.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Emiya on 2017/3/23.
 */

public class Demo5 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s = "我的电话号码是18779789084，我以前的号码是13755897936，还有16228475974也是我的号码";
        String regex = "1[34869]\\d{9}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
