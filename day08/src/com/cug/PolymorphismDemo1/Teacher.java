package com.cug.PolymorphismDemo1;

public class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("Teacher's information: " + "name: " + getName() + "age: " + getAge());
    }
}
