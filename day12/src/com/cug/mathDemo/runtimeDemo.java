package com.cug.mathDemo;

import java.io.IOException;

public class runtimeDemo {
    public static void main(String[] args) throws IOException {
//        Runtime r1 = Runtime.getRuntime();
//        Runtime r2 = Runtime.getRuntime();
//        System.out.println(r1 == r2);

////        停止虚拟机
//        Runtime.getRuntime().exit(0);
//        可以获得CPU的线程的个数
        System.out.println(Runtime.getRuntime().availableProcessors());
//        可以获得的总内存大小
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 / 1024 + " GB");
//        已经获得的总内存的大小
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + " MB");
//        剩余的内存大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + " MB");
        Runtime.getRuntime().exec("notepad");
    }
}
