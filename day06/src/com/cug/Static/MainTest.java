package com.cug.Static;

public class MainTest {
//    args是之前JDK中用来接收输入的.
    public static void main(String[] args) {
        System.out.println(args.length);
        for (String str : args) {
            System.out.println(str);
        }
    }
}
