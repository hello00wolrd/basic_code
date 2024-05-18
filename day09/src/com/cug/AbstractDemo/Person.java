package com.cug.AbstractDemo;

//抽象类和抽象方法
//抽象类不能实例化
//抽象类不一定有抽象方法,有抽象方法一定是抽象类
//可以有构造方法
//抽象类的子类要么重写抽象类中的所有抽象方法,要么也是抽象类
public abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public abstract void work();
//    强制子类按照这种格式书写
}
