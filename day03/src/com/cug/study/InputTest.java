package com.cug.study;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
//        键盘录入
//        第一套体系
//        nextInt();
//        nextDouble();
//        next();
//        遇到空格和回车会停止
//        第二套体系:
//        nextLine();
//        遇到回车才会停止
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(str1);
    }
}
