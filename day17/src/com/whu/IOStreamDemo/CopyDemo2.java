package com.whu.IOStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\电子书\\C++ Primer Plus（第6版）_中文版_带书签_超清.pdf");
        FileOutputStream fos = new FileOutputStream("E:\\电子书\\C++ Primer Plus_copy.pdf");
        byte[] buffer = new byte[1024 * 1024 * 10];
        int len = 0;
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        fis.close();
        fos.close();
    }
}
