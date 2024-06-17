package com.cug.dateDemo1;

import java.util.Date;

public class dateDemo1 {
    public static void main(String[] args) {
//        创建个实践对象
        Date d = new Date();
        System.out.println(d);
//        创建个指定时间的对象
        Date d2 = new Date(0L);
        System.out.println(d2);
//        setTime 可以修改时间
        d2.setTime(1000L);
        System.out.println(d2);
//        getTime 可以获得当前时间的毫秒值
        long d3 = d2.getTime();
        System.out.println(d3);
        d3 = System.currentTimeMillis();
        System.out.println(d3);
    }
}
