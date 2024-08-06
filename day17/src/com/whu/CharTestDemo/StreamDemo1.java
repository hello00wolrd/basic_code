package com.whu.CharTestDemo;

import java.io.*;

public class StreamDemo1 {
    public static void main(String[] args) throws IOException {
        //    拷贝文件夹
        File src = new File("day17/src/com/whu/test");
        File dest = new File("day17/src/com/whu/CopyDemo");
        copyDir(src, dest);
    }

    public static void copyDir(File src, File dest) throws IOException {
        dest.mkdirs();
        File[] arr = src.listFiles();
        for (File f : arr) {
            if (f.isFile()) {
                FileInputStream fis = new FileInputStream(f);
                FileOutputStream fos = new FileOutputStream(new File(dest, f.getName()));
//                1M
                byte[] b = new byte[1024 * 1024];
                int len;
                while ((len = fis.read(b)) != -1) {
                    fos.write(b, 0, len);
                }
                fos.close();
                fis.close();
            } else {
                copyDir(f, new File(dest, f.getName()));
            }
        }
    }
}

