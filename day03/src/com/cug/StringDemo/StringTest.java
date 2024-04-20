package com.cug.StringDemo;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        int len = str1.length();
        System.out.println(len);
        String ss = str1.toUpperCase();
        System.out.println(ss);
        System.out.println(str1.hashCode());
    }
}
