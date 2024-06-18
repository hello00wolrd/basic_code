package com.whu.Training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateTheNumberOfDaysAliveDemo {
    public static void main(String[] args) throws ParseException {
//        random day
        String birthday = "2000年1月1日";
        calulateTheDay(birthday);
    }

    private static void calulateTheDay(String birthday) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        long nowTime = System.currentTimeMillis();
        long time = nowTime - birthdayTime;
        System.out.println("自从出生到现在经过了" + time / 1000 / 60 / 60 / 24 + "天");
    }
}
