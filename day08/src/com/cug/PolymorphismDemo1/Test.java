package com.cug.PolymorphismDemo1;

//多态可以传递父类来实现一个参数实现各自子类参数
public class Test {
    public static void main(String[] args) {
        Person s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);

        Teacher t1 = new Teacher();
        t1.setAge(20);
        t1.setName("李四");

        register(s1);
        register(t1);
    }

    public static void register(Person p) {
        p.show();
    }
}
