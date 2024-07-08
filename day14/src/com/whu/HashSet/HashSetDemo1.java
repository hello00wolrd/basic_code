package com.whu.HashSet;

import com.whu.Instance.Student;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhangsan", 22);

        HashSet<Student> hs1 = new HashSet<>();

        System.out.println(hs1.add(s1));
        System.out.println(hs1.add(s2));
        System.out.println(hs1.add(s3));
        System.out.println(hs1.add(s4));

        System.out.println(hs1);

    }
}
