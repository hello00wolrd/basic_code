package com.cug.InterFace;

public class Dog extends Animal implements Swim{

    @Override
    public void eat() {
        System.out.println("Dog is eating bones");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }
}
