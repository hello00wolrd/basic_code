package com.whu.FileDemo2;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File file = new File("day17/src/com/whu/test/bbb");
        boolean exists = haveAvi(file);
        System.out.println(exists);
    }

    public static boolean haveAvi(File file) {
        File[] arr = file.listFiles();
        boolean flag = false;
        if (arr != null) {
            for (File f : arr) {
                if (f.isFile() && f.getName().endsWith("avi")) {
                    System.out.println(f.getAbsolutePath());
                    flag = true;
                }
            }
        }
        return flag;
    }
}
