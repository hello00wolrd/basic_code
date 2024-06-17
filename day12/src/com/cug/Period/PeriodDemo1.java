package com.cug.Period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

//        生日的年月日
        LocalDate birthDay = LocalDate.of(2002, 1, 1);
        System.out.println(birthDay);
        Period pd = Period.between(birthDay, today);
        System.out.println(pd);//P22Y5M16D

        System.out.println(pd.getYears());
        System.out.println(pd.getMonths());
        System.out.println(pd.getDays());

        System.out.println(pd.toTotalMonths());
    }
}
