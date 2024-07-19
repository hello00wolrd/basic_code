package com.whu.FileDemo1;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        String catalog = "day17/src/com/whu/FileDemo1";
        File f1 = new File(catalog, "a.txt");
        boolean flag = f1.delete();
        System.out.println(flag);

//        如果删除的是文件,可以直接删除,不走回收站
//        如果删除的是文件夹,文件夹内有内容,那么会删除失败
//        如果删除的是文件夹,文件夹内没有内容才会直接删除

        File f2 = new File(catalog, "aaa");
        System.out.println(f2);
        flag = f2.delete();
        System.out.println(flag);
    }
}
