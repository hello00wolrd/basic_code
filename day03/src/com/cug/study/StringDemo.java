package com.cug.study;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        //键盘键入一个字符串
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int lowerLetter = 0;
        int upperLetter = 0;
        int number = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);//输入索引,返回字符串中该索引的字符
            if (ch1 >= 'a' && ch1 <= 'z') {
                lowerLetter++;
            } else if (ch1 >= 'A' && ch1 <= 'Z') {
                upperLetter++;
            } else if (ch1 >= '0' && ch1 <= '9') {
                number++;
            }
        }
        System.out.println("有" + lowerLetter + "个小写字母");
        System.out.println("有" + upperLetter + "个大写字母");
        System.out.println("有" + number + "个数字");
    }
}
