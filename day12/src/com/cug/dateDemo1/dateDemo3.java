package com.cug.dateDemo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo3 {
    public static void main(String[] args) throws ParseException {
//        利用simpleDateFormat把date转成默认格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date(0L);
        String str = sdf.format(d);
        System.out.println(str);
//        利用带参构造创建SimpleDateFormat来指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy EE");
        String str2 = sdf2.format(d);
        System.out.println(str2);
//        把字符串转换成Date对象,再打印
        Date d1 = sdf2.parse(str2);
        System.out.println(d1);
    }
}
