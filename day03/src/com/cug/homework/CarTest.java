package com.cug.homework;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < carArray.length; i++) {
            Car temp = new Car();
//            这个new的car得放在循环内,否则会栈内指针指向一个堆内对象
//            Scanner sc = new Scanner(System.in);
//            每次循环在堆内创建(和在循环外创建有所不同)
            System.out.println("请输入品牌 价格 颜色(空格分割)");
            temp.setBrand(sc.next());
            temp.setPrice(sc.nextDouble());
            temp.setColor(sc.next());
            carArray[i] = temp;
        }
        for (int i = 0; i < carArray.length; i++) {
            System.out.println(carArray[i].toString());
        }
    }
}
