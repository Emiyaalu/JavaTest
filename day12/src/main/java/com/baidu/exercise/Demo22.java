package com.baidu.exercise;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Emiya on 2017/4/1.
 */

public class Demo22 {
    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();
        t.schedule(new MyTimerTask(), new Date(117, 3, 1, 20, 52, 50), 3000);
        while (true) {
            Thread.sleep(1000);
            System.out.println(new Date());
        }
    }
}

class MyTimerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("起床背英语。");
    }
}