package com.whu.Packaging;

import java.util.Scanner;

public class IntegerDemo3 {
    public static void main(String[] args) {
//        以后输入不论什么类型,都用nextline,这样可以接收一整行的数据
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = Integer.parseInt(str);
        System.out.println(i+1);
    }
}
