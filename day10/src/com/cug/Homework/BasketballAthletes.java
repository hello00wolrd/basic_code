package com.cug.Homework;

public class BasketballAthletes extends Athletes {

    @Override
    public void study() {
        System.out.println("i am studying basketball");
    }

    public BasketballAthletes() {
    }

    public BasketballAthletes(int age, String name) {
        super(age, name);
    }
}
