package com.cug.dateDemo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) throws ParseException {
//        把 3011-12-29 转换成 29/12/3011
        String str = "3011-12-29";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf1.parse(str);
//        System.out.println(d1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        String result = sdf2.format(d1);
        System.out.println(result);
    }
}
