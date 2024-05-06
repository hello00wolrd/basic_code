package com.cug.Expend;

public class Person2 {
    String name;
    int age;

    public Person2() {
        System.out.println("父类的无参构造");
    }

    public Person2(String name, int age) {
        System.out.println("父类的有参构造");
        this.name = name;
        this.age = age;
    }
}
