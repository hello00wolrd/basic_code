package com.cug.StringDemo;
//在描述一类事物的类中是不写main方法的这些类叫做JavaBean类
//一个文件中可以定义多个类,但是只能有一个类是public修饰的,public修饰的类名必须是java代码的文件名称
//在实际开发中建议一个文件定义一个类
public class Phone {
    //定义属性
    String brand;
    double price;

    //定义方法
    public void call() {
        System.out.println("手机在打电话");
    }

    public void playGame() {
        System.out.println("手机在玩游戏");
    }
}
