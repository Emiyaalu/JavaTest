package com.baidu.dt_daili;

/**
 * Created by Emiya on 2017/4/4.
 */

public class StudentImp implements Student {
    @Override
    public void login() {
        System.out.println("登录");
    }

    @Override
    public void submit() {
        System.out.println("提交");
    }
}
