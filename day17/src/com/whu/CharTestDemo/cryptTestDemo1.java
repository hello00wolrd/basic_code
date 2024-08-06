package com.whu.CharTestDemo;

import java.io.*;

public class cryptTestDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("day17/src/com/whu/CharTestDemo/cryptTest.txt");
        int key = 2134;
        encrypt(file, key);
        decrypt(new File(file+".encrypt"), key);
    }

    private static void decrypt(File file, int key) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file + ".decrypt");
        int b = 0;
        while ((b = fis.read()) != -1) {
            fos.write(b ^ key);
        }
        fos.close();
        fis.close();
    }

    private static void encrypt(File file, int key) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file + ".encrypt");
//        1M
        int b = 0;
        while ((b = fis.read()) != -1) {
            fos.write(b ^ key);
        }
        fos.close();
        fis.close();
    }
}
