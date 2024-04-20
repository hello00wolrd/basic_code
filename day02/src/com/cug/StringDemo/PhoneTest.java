package com.cug.StringDemo;

public class PhoneTest {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.brand = "小米";
        ph.price = 1999.0;
        ph.call();
        ph.playGame();
        System.out.println(ph.brand);
        System.out.println(ph.price);
        Phone ph2 = new Phone();//这里实现了第二个的对象

    }
}
