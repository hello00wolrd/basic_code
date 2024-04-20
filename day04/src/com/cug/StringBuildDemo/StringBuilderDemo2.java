package com.cug.StringBuildDemo;

import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//        System.out.println(sb);
        String result = sb.reverse().toString();
        if (result.equals(str)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }
}
