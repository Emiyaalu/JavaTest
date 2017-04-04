package com.baidu.exercise;

import com.baidu.bean.Person;
import com.baidu.bean.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by Emiya on 2017/3/31.
 */

public class Demo18_ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xxx.txt"));
        ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
        for (Person p : list) {
            System.out.println(p);
        }

        ois.close();
    }
}
