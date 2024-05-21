package com.cug.InnerDemo;

public class Outer {
    private int b = 20;

    public void show() {
        int a = 10;
        class Inner {
            String name;
            int age;

            public void method1() {
                System.out.println(a);
                System.out.println(b);
                System.out.println("method1 has been called");
            }

            public static void method2() {
                System.out.println("method2 has been called,method2 is a local interior class");
            }
        }
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();
    }
}
