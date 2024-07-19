package com.whu.IOStreamDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day17/src/com/whu/IOStreamDemo/a.txt");
       /* int read = fis.read();
//        当读取不到的时候会返回-1
        System.out.println(read);
        fis.close();*/
        int b = -1;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
        fis.close();
    }
}
