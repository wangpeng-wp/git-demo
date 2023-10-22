package com.wp.test;

import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;

/**
 * Created by wp on 2023/10/22.
 */
public class git_test {
    public static void main(String[] args) {
        System.out.println("测试！！");
        System.out.println("测试！！");
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sd.format(new Date());
        System.out.println(format);
    }
}
