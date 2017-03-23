package com.baidu.scanner;

/**
 * Created by Emiya on 2017/3/21.
 */

public class Demo5 {
    public static void main(String[] args) {
        String max = "asyysdlkjysldkfyysldkfjsyysldfkjyy;;;324yyysldkfjyyyy";
        String min = "yy";
        int count = 0;
        int index = 0;
        while ((index = max.indexOf(min)) != -1) {
                count++;
                max = max.substring(index + min.length());
        }
        System.out.println("找到了" + count + "次");
    }
}
