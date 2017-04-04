package com.baidu.bean;

import java.io.Serializable;

/**
 * Created by Emiya on 2017/3/20.
 */

public class Person implements Comparable<Person>, Serializable {
    private String name;
    private int age;

    /*public Person() {
    }*/

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "我的姓名是：" + name + "...我的年龄是：" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Person o) {
        int num = this.age - o.age;
        return num == 0 ? this.name.compareTo(o.name) : num;
    }

    public void eat() {
        System.out.println("今天吃了一顿金钱豹。");
    }

    public void eat(int num) {
        System.out.println("今天吃了" + num + "顿金钱豹。");
    }

}
