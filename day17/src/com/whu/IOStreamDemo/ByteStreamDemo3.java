package com.whu.IOStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day17/src/com/whu/IOStreamDemo/a.txt", true);
        String str = "\r\nhello";
        byte[] arr = str.getBytes();
        System.out.println(Arrays.toString(arr));
        fos.write(arr);
        str = "\r\n666";
        arr = str.getBytes();
        fos.write(arr);
        fos.close();
    }
}
