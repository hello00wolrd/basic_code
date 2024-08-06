package com.whu.CharTestDemo;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    //    字符流输出和输入都有一个8192的缓冲区
//    值得注意的是输出的时候只有当缓冲区满或者flush或者close的时候会实现output
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\java_code\\basic_code\\day17\\src\\com\\whu\\CharTestDemo\\b.txt");
/*        for (int i = 0; i < 8192; i++) {
            fw.write(97);
        }*/
        for (int i = 0; i < 8193; i++) {
            fw.write(98);
//            fw.flush();
        }
        fw.close();
    }
}
