package com.cug.Expend;

public class TestExtend2 {
    public static void main(String[] args) {
        Student2 stu2 = new Student2();//会先调用父类的无参构造再调用子类的无参构造
        Student2 stu3 = new Student2("saliwen", 22);
    }
}
