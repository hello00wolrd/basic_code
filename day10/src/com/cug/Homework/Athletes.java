package com.cug.Homework;

public abstract class Athletes extends Person {
    public abstract void study();

    public Athletes() {
    }

    public Athletes(int age, String name) {
        super(age, name);
    }
}
