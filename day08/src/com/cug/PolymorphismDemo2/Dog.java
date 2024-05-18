package com.cug.PolymorphismDemo2;

public class Dog extends Animal {
    public String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog的show方法");
    }
}
