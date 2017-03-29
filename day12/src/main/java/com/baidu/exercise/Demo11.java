package com.baidu.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Emiya on 2017/3/28.
 */

public class Demo11 {
    public static void main(String[] args) {
//        Demo1();
//        Demo2();
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        String[] color = {"黑桃", "红桃", "梅花", "方块" };
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (String s1 :
                num) {
            for (String s2 :
                    color) {
                hm.put(index, s2.concat(s1));
                list.add(index++);
            }
        }
        hm.put(index, "小王");
        list.add(index++);
        hm.put(index, "大王");
        list.add(index);

        Collections.shuffle(list);

        TreeSet<Integer> emiya = new TreeSet<>();
        TreeSet<Integer> emily = new TreeSet<>();
        TreeSet<Integer> noah = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (i >= list.size() - 3) {
                dipai.add(list.get(i));
            } else if (i % 3 == 0) {
                emiya.add(list.get(i));
            } else if (i % 3 == 1) {
                emily.add(list.get(i));
            } else {
                noah.add(list.get(i));
            }
        }

        lookPoker(hm,emiya,"emiya");
        lookPoker(hm,emily,"emily");
        lookPoker(hm,noah,"noah");
        lookPoker(hm,dipai,"dipai");

    }

    public static void lookPoker(HashMap<Integer, String> hm, TreeSet<Integer> ts, String name) {
        System.out.print(name + "的底牌是：");
        for (Integer i :
                ts) {
            System.out.print(hm.get(i) + " ");
        }
        System.out.println();
    }

    public static void Demo2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        char[] arr = line.toCharArray();
        for (Character c :
                arr) {
            lhm.put(c, lhm.containsKey(c) ? lhm.get(c) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> en :
                lhm.entrySet()) {
            System.out.println(en.getKey() + "。。。出现了" + en.getValue() + "次");
        }
        System.out.println(lhm);
    }

    public static void Demo1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 23);
        map.put("王五", 24);
        map.put("赵六", 25);
        map.put("周七", 26);

        for (Map.Entry<String, Integer> en :
                map.entrySet()) {
            System.out.println(en.getKey() + "=" + en.getValue());
        }
    }
}
