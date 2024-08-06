package com.whu.CharTestDemo;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        fr = new FileReader("E:\\java_code\\basic_code\\day17\\src\\com\\whu\\CharTestDemo\\a.txt");
        char[] cbuf = new char[1024];
        int len = 0;
        while ((len = fr.read(cbuf)) != -1) {
            System.out.print(new String(cbuf, 0, len));
        }
        fr.close();
    }
}
