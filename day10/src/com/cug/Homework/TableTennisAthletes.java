package com.cug.Homework;

public class TableTennisAthletes extends Athletes implements SpeakEnglish {
    @Override
    public void study() {
        System.out.println("i am studying how to play table tennis");
    }

    @Override
    public void speakEnglish() {
        System.out.println("i am speaking english");
    }

    public TableTennisAthletes() {
    }

    public TableTennisAthletes(int age, String name) {
        super(age, name);
    }
}
