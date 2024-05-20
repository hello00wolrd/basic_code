package com.cug.Homework;

public abstract class Teachers extends Person {
    public abstract void teach();

    public Teachers() {
    }

    public Teachers(int age, String name) {
        super(age, name);
    }
}
