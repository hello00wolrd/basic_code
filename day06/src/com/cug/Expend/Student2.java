package com.cug.Expend;

public class Student2 extends Person2 {
    public Student2() {
        super();
        System.out.println("子类无参构造");
    }

    public Student2(String name, int age) {
        super(name, age);
        System.out.println("子类的有参构造" + this.name + this.age);
    }
}
