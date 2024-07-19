package com.whu.FileDemo1;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
//        listFiles方法可以获取文件夹内的内容,并且把内容放到数组中返回
        String catalog = "day17/src/com/whu/FileDemo1";
        File f1 = new File(catalog);
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
