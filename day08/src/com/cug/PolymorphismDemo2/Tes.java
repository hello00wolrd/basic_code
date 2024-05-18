package com.cug.PolymorphismDemo2;

//在使用多态的时候,Fu a= new Zi;
//调用成员变量时:编译看左边,运行也看左边
//调用成员变量时:编译看左边,运行看右边
public class Tes {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.name);
//        "动物"
        a.show();
//        "Dog的show方法"
    }
}

//多态的弊端,不能调用子类的特有功能