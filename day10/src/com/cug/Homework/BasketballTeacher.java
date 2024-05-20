package com.cug.Homework;

public class BasketballTeacher extends Teachers {

    @Override
    public void teach() {
        System.out.println("i am teaching how to play basketball");
    }

    public BasketballTeacher() {
    }

    public BasketballTeacher(int age, String name) {
        super(age, name);
    }
}
