package com.cug.TestDemo;

//构造代码块
//1.写在成员位置的代码块
//2.作用可以把多个构造方法中重复的代码抽取出来
//3.执行时机,我们在创建本类对象的时候会先执行构造代码块再执行构造方法
public class TestDemo1 {
    private String name;
    private int age;

    {
        System.out.println("这是个构造代码块!");
        System.out.println("开始创建对象");
    }

    public TestDemo1(String name, int age) {
        System.out.println("有参构造");
        this.name = name;
        this.age = age;
    }

    public TestDemo1() {
        System.out.println("空参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
