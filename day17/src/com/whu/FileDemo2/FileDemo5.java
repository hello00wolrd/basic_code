package com.whu.FileDemo2;

import java.io.File;

public class FileDemo5 {
    //    查找一个文件夹内以及其所有的子文件夹内的avi结尾的文件
    public static void main(String[] args) {
        String path = "C:/";
        File file = new File(path);
        System.out.println(haveAVI(file));
    }

    public static boolean haveAVI(File file) {
        boolean flag = false;
        File[] arr = file.listFiles();
//        当listFiles访问到空文件夹或者无权限文件夹的时候会返回null
        if (arr != null) {
            for (File f : arr) {
                if (f.isDirectory()) {
                    flag = flag || haveAVI(f);
                } else {
                    if (f.isFile() && f.getName().endsWith(".avi")) {
                        System.out.println("-------------");
                        System.out.println(f);
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
