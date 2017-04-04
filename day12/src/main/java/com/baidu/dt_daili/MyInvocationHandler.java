package com.baidu.dt_daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Emiya on 2017/4/4.
 */

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("权限校验");
        method.invoke(target, objects);
        System.out.println("日志记录");
        return null;
    }
}
