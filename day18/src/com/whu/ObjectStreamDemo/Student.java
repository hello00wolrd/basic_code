package com.whu.ObjectStreamDemo;

import java.io.Serial;
import java.io.Serializable;

/*
Serializable接口内没有抽象方法,
是一个标记性接口



* */
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -8424848370531695098L;
    private String name;
    private int age;
//    transient:瞬态关键字
//    不会把当前的关键字序列化到本地文件中

    private transient String address;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
