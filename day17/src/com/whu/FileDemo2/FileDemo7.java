package com.whu.FileDemo2;

import java.io.File;

public class FileDemo7 {
    public static void main(String[] args) {
        File f1 = new File("E:\\java_code\\basic_code\\day16\\src");
        System.out.println(getLen(f1)/1024+"KB");

    }

    //    统计一个文件夹的总大小
    public static long getLen(File fsrc) {
        long len = 0;
        File[] arr = fsrc.listFiles();
        if (arr != null) {
            for (File f : arr) {
                if (f.isFile()) {
                    len += f.length();
                } else {
                    len+=getLen(f);
                }
            }
            return len;
        }
        return -1;
    }
}
