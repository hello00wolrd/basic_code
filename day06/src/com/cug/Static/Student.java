package com.cug.Static;
/*
 * 静态方法,只能访问静态
 * 非静态方法可以访问所有
 * 静态方法中没有this关键字
 * */
public class Student {
    String name;
    int age;
    static String teacherName;

    public void show1() {
        System.out.println(name + "," + age + "," + teacherName);
    }
    public static void method(){
        System.out.println("静态方法");
    }
}
