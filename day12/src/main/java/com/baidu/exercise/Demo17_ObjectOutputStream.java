package com.baidu.exercise;

import com.baidu.bean.Person;
import com.baidu.bean.Student;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Created by Emiya on 2017/3/31.
 */

public class Demo17_ObjectOutputStream {
    public static void main(String[] args) throws IOException {
//        Demo1();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("xxx.txt"));
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Student("张三", 23));
        list.add(new Student("李四", 24));
        list.add(new Student("王五", 25));
        oos.writeObject(list);

        oos.close();
    }

    public static void Demo1() throws IOException {
        FileInputStream fis = new FileInputStream("G:\\test.txt");
        byte[] arr = new byte[5];
        int len;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while ((len = fis.read(arr)) != -1) {
            baos.write(arr, 0, len);
        }
        System.out.println(baos);

        fis.close();
    }
}
