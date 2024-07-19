package com.whu.FileDemo1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo1 {
    public static void main(String[] args) {
        String str = "E:\\java_code\\basic_code\\day17\\src\\com\\whu\\FileDemo1\\a.txt";
        File f1 = new File(str);
        System.out.println(f1.isDirectory());
        System.out.println(f1.exists());
        System.out.println(f1.isFile());

//        返回的是字节个数
        System.out.println(f1.length());
        long len1 = f1.length();
        System.out.println(len1);
//        返回绝对路径
        File f2 = new File("basic_code\\day17\\src\\com\\whu\\FileDemo1\\a.txt");
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getName());
//      返回时间,若f1还在访问文件那么f2在访问文件的时候会发生i/o错误返回0
        long time = f1.lastModified();
        System.out.println(time);
        Date newDate = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str2 = sdf.format(newDate);
        System.out.println(str2);

    }
}
