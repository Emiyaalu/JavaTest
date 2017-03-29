package com.baidu.exercise;

import com.baidu.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Emiya on 2017/3/26.
 */

public class Demo9 {
    public static void main(String[] args) {
//        Demo1();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入：姓名，语文，数学，英语");
        String line = sc.nextLine();
        String[] arr = line.split(",");
        for (String s :
                arr) {
            System.out.println(s);
        }
        System.out.println(arr.length);
    }

    public static void Demo1() {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("张三",23));
        list.add(new Student("张三",23));
        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        list.add(new Student("李四",24));
        list.add(new Student("李四",24));
        list.add(new Student("王五",25));
        list.add(new Student("王五",25));
        list.add(new Student("王五",25));
        list.add(new Student("赵六",26));
        list.add(new Student("赵六",26));
        list.add(new Student("赵六",26));

        ArrayList newList = getSingle(list);
        System.out.println(newList);
    }

    public static ArrayList getSingle(ArrayList list) {
        ArrayList<Student> newList = new ArrayList<Student>();
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student st = it.next();
            if (!newList.contains(st)) {
                newList.add(st);
            }
        }
        return newList;
    }

}
