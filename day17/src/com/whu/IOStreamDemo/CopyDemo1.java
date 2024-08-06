package com.whu.IOStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\java_code\\basic_code\\day17\\src\\com\\whu\\IOStreamDemo\\ByteStreamDemo1.java");
        FileOutputStream fos = new FileOutputStream("day17/src/com/whu/IOStreamDemo/copyDemo1.pdf");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
