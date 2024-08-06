package com.whu.CharTestDemo;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        fr = new FileReader("E:\\java_code\\basic_code\\day17\\src\\com\\whu\\CharTestDemo\\a.txt");
        int b = 0;
        while ((b = fr.read()) != -1) {
            System.out.print((char) b);
//            System.out.print(b);
        }
        fr.close();
    }
}
