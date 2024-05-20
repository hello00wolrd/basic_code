package com.cug.Homework;

public class TableTennisTeacher extends Teachers implements SpeakEnglish {

    @Override
    public void speakEnglish() {
        System.out.println("i am speaking english");
    }

    @Override
    public void teach() {
        System.out.println("i am teaching table tennis");
    }

    public TableTennisTeacher() {
    }

    public TableTennisTeacher(int age, String name) {
        super(age, name);
    }
}
