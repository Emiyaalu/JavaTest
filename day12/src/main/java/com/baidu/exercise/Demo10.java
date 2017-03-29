package com.baidu.exercise;

import com.baidu.bean.Person;
import com.baidu.bean.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Emiya on 2017/3/27.
 */

public class Demo10 {
    public static void main(String[] args) {
//        Demo1();
//        Demo2();
//        Demo3();
//        Demo4();
//        Demo5();
//        Demo6();
//        Demo7();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩，格式是：姓名，语文成绩，数学成绩，英语成绩");
        TreeSet<Student2> ts = new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                int num = s2.getSum() - s1.getSum();
                return num == 0 ? 1 : num;
            }
        });
        while (ts.size() < 5) {
            String line = sc.nextLine();
            String[] arr = line.split("，");
            String name = arr[0];
            Integer chinese = Integer.parseInt(arr[1]);
            Integer math = Integer.parseInt(arr[2]);
            Integer english = Integer.parseInt(arr[3]);
            ts.add(new Student2(name, chinese, math, english));
        }
        System.out.println("打印排序后的学生信息：");
        for (Student2 s :
                ts) {
            System.out.println(s);
        }

    }

    public static void Demo7() {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                int num = i2.compareTo(i1);
                return num == 0 ? 1 : num;
            }
        });
        while (true) {
            String line = sc.nextLine();
            if ("quit".equals(line)) {
                break;
            }
            Integer i = Integer.parseInt(line);
            ts.add(i);
        }
        for (Integer i :
                ts) {
            System.out.println(i);
        }
    }

    public static void Demo6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        char[] arr = line.toCharArray();
        TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

            @Override
            public int compare(Character c1, Character c2) {
                int num = c1 - c2;
                return num == 0 ? 1 : num;
            }
        });
        for (char c :
                arr) {
            ts.add(c);
        }
        for (Character c :
                ts) {
            System.out.print(c);
        }
    }

    public static void Demo5() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("aa");
        list.add("cc");
        list.add("cc");
        list.add("xx");
        list.add("aa");
        list.add("bb");
        list.add("bb");
        list.add("xx");
        list.add("xxxx");
        list.add("xxx");

        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<String> list) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int num = s1.compareTo(s2);
                return num == 0 ? 1 : num;
            }
        });
        ts.addAll(list);
        list.clear();
        list.addAll(ts);
    }

    public static void Demo4() {
        TreeSet<Student> ts = new TreeSet<>(new CompileByLen());
        ts.add(new Student("ddddd", 23));
        ts.add(new Student("aaa", 66));
        ts.add(new Student("c", 15));
        ts.add(new Student("aaaaaaaa", 13));
        ts.add(new Student("ffffffff", 13));
        ts.add(new Student("rrr", 32));
        System.out.println(ts);
    }


    public static void Demo3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");

        System.out.println(list);
        getSingle(list);
        System.out.println(list);
    }

    public static void getSingle(List<String> list) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.addAll(list);
        list.clear();
        list.addAll(lhs);
    }

    public static void Demo2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符：");
        String line = sc.nextLine();
        char[] arr = line.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        for (char c :
                arr) {
            hs.add(c);
        }
        for (Character ch :
                hs) {
            System.out.println(ch);
        }
    }

    public static void Demo1() {
        Random r = new Random();
        HashSet<Integer> hs = new HashSet<>();
        while (hs.size() < 10) {
            hs.add(r.nextInt(20) + 1);
        }
        for (Integer integer :
                hs) {
            System.out.println(integer);

        }
    }
}

class CompileByLen implements Comparator<Person> {


    @Override
    public int compare(Person p1, Person p2) {
        int num = p1.getName().length() - p2.getName().length();
        return num == 0 ? p1.getName().compareTo(p2.getName()) : num;
    }
}

class Student2 {
    String name;
    int chinese;
    int math;
    int english;
    int sum;

    public Student2() {
    }

    public Student2(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
        this.sum = this.chinese + this.math + this.english;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return name + "," + chinese + "," + math + "," + english + "," + sum;
    }
}
