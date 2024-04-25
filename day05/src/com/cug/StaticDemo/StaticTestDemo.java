package com.cug.StaticDemo;
//静态成员变量被所有类对象所共享
//调用方式:类名调用
//对象名调用
//静态变量是优先于类而加载的,优先于对象存在
public class StaticTestDemo {
    public static void main(String[] args) {
        StaticDemo.teacherName = "夏老师";
        StaticDemo sd1 = new StaticDemo();
        sd1.setGender("man");
        sd1.setAge(20);
        sd1.setName("Bob");
        System.out.println(sd1);//由于toString所以可以直接打印sd1内的内容而不是打印地址
        StaticDemo sd2 = new StaticDemo();
        sd2.setGender("woman");
        sd2.setAge(30);
        sd2.setName("Alice");
        System.out.println(sd2);
    }
}
