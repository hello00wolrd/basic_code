package com.whu.PrintStreamDemo;

import java.io.*;
import java.nio.charset.Charset;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        字节打印输出流
        * */
        PrintStream ps = new PrintStream(new FileOutputStream("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\PrintStreamDemo\\a.txt"), true, Charset.forName("utf-8"));
        ps.println("Hello World1");
        ps.print("Hello World2");
        ps.printf("%s", "Hello World3");
        ps.close();
//        字符打印流
        PrintWriter pw = new PrintWriter(new FileWriter("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\PrintStreamDemo\\b.txt", true));
        pw.println("Hello World4");
        pw.close();

        /*
        值得注意的是系统打印流也是一种PrintStream,由虚拟机创建,指向控制台
        是一种特殊的流,不能关闭,这种流是唯一的
        * */
        PrintStream ps2 = System.out;
        ps2.println("Hello World4");
    }
}
