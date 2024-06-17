package com.cug.dateDemo1;

import java.util.Date;
import java.util.Random;

public class dateDemo2 {
    //    实现一个原点后1年的时间
    public static void main(String[] args) {
//        创建个date对象
        Date d1 = new Date(0L);
        long time = d1.getTime() + 365L * 24 * 60 * 60 * 1000;
        d1.setTime(time);
        System.out.println(d1);

        Random r = new Random();
        Date d2 = new Date(r.nextLong(100000000000L, 200000000000L));
        System.out.println(d2);
    }
}
