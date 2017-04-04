package com.baidu.dt_daili;

import java.lang.reflect.Proxy;

/**
 * Created by Emiya on 2017/4/4.
 */

public class Test {
    public static void main(String[] args) {
//        UserImp ui = new UserImp();
//        MyInvocationHandler mih = new MyInvocationHandler(ui);
//        User u = (User) Proxy.newProxyInstance(ui.getClass().getClassLoader(), ui.getClass().getInterfaces(), mih);
//        u.add();
//        u.delete();
        StudentImp si = new StudentImp();
        si.login();
        si.submit();
        System.out.println("-----------------");
        MyInvocationHandler mih = new MyInvocationHandler(si);
        Student s =  (Student)  Proxy.newProxyInstance(si.getClass().getClassLoader(), si.getClass().getInterfaces(), mih);
        s.login();
        s.submit();

        UserImp ui = new UserImp();
        ui.print();
        User.fun();

    }
}
