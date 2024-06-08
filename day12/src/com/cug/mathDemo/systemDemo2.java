package com.cug.mathDemo;

public class systemDemo2 {
    public static void main(String[] args) {
        student s1 = new student("zhang san", 12);
        student s2 = new student("li si", 13);
        student s3 = new student("wang wu", 14);
//        如果数据来源的数组和目的数组都是引用数据类型,那么子类型可以赋值给父类类型
        student[] arr1 = {s1, s2, s3};
        person[] arr2 = new person[3];
        System.arraycopy(arr1, 0, arr2, 0, 3);
        for (int i = 0; i < arr1.length; i++) {
            student stu = (student) arr2[i];
            System.out.println(stu.getName() + " " + stu.getAge());
        }
    }
}

class person {
    private String name;
    private int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class student extends person {
    public student() {
    }

    public student(String name, int age) {
        super(name, age);
    }
}