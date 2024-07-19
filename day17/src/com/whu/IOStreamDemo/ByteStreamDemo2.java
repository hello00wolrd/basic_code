package com.whu.IOStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day17/src/com/whu/IOStreamDemo/a.txt");
        byte[] arr = {79,79,70,79,79,79,79,79,79,79};
//        00F000
//        fos.write(arr);
        fos.write(arr,2,2);
//        写2,3
        fos.close();
    }
}
