package com.cug.InterFace;

public class Frog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("Frog is eating bugs");
    }

    @Override
    public void swim() {
        System.out.println("Frog breaststrokes");
    }

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
}
