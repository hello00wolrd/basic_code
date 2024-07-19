package com.whu.FileDemo1;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        String catalog = "day17/src/com/whu/FileDemo1";
        File f1 = new File(catalog, "b.txt");
        boolean flag = f1.createNewFile();
        System.out.println(flag);
        File f2 = new File(catalog, "/testDir");
        flag = f2.mkdir();
        System.out.println(flag);
//        mkdirs创建多级文件夹
        File f3 = new File(catalog, "/aaa/bbb/ccc/ddd");
        flag = f3.mkdirs();
        System.out.println(flag);
    }
}
