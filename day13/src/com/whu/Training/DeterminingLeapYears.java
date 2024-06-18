
package com.whu.Training;

import java.time.LocalDate;
import java.util.Calendar;

public class DeterminingLeapYears {
    public static void main(String[] args) {
//        把日期设置为3月1日往前一天看看是28号还是29号
        Integer i = 1900;
        for (int j = 0; j <= 2100; j++) {
            System.out.println(judge(i));
            System.out.println(judge2(i));
            i++;
        }
//        System.out.println(judge(2002));
    }

    private static boolean judge(int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth);
        if (dayOfMonth > 28) return true;
        else return false;
    }

    private static boolean judge2(int year) {
        LocalDate ld = LocalDate.of(year, 1, 1);
        return ld.isLeapYear();
    }
}
