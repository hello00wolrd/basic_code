package com.cug.Calendar;

import java.util.Calendar;
import java.util.Date;

/*
 * calendar 是一个抽象类,不能创建对象
 * calendar 代表系统当前的日历对象,可以单独修改获取 年 月 日
 * 本质上是一个数组
 * 细节:
 * 月份范围是0-11,所以输出为0,则为1月
 * 星期:
 * 在老外严重星期日为一个星期的第一天
 * 1(星期日) 2(星期一) ...
 * */
public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        Calendar对象的本质上是一个数组
        System.out.println(c);

//        修改日历
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "-" + month + "-" + day);
//        修改具体事项
        c.set(Calendar.YEAR, 2000);
        System.out.println(c.get(Calendar.YEAR));
//        增加一年
        c.add(Calendar.YEAR,1);
        System.out.println(c.get(Calendar.YEAR));
    }
}
