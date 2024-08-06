package com.whu.CharTestDemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharTestDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "hi你好";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
//        1+1+3+3=8
        byte[] byte2 = str.getBytes("GBK");
//        1+1+2+2=6
        System.out.println(Arrays.toString(byte2));
//        解码
        String str2 = new String(bytes, "GBK");
        System.out.println(str2);
        str2 = new String(byte2, "UTF-8");
        System.out.println(str2);
    }
}
