package com.cug.Homework;

public class Test {
    public static void main(String[] args) {
        TableTennisAthletes tta = new TableTennisAthletes(18, "Ma Long");
        System.out.println(tta);
        tta.speakEnglish();
        tta.study();
        System.out.println(tta.getName());
        System.out.println(tta.getAge());
    }
}
