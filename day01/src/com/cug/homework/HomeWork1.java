package com.cug.homework;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//输入一个三位数,获取其百位十位个位
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        System.out.println(number / 100);
        System.out.println(number / 10 % 10);
        System.out.println(number % 10);

    }
}
