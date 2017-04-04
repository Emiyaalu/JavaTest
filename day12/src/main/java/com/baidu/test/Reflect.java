package com.baidu.test;

import com.baidu.bean.Frult;
import com.baidu.bean.Juicer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Emiya on 2017/4/3.
 */

public class Reflect {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        BufferedReader br = new BufferedReader(new FileReader("config.properties"));
        Class clazz = Class.forName(br.readLine());
        Frult f = (Frult) clazz.newInstance();
        Juicer j = new Juicer();
        j.run(f);

    }
}
