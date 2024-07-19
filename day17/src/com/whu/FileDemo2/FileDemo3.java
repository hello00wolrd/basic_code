package com.whu.FileDemo2;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
//        在test文件夹下创建一个ccc.txt文件
        String path = "day17/src/com/whu/test";
        File f1 = new File(path, "ccc.txt");
        boolean flag = f1.createNewFile();
        System.out.println(flag);
    }
}
