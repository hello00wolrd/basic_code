package com.whu.HashSet;
//相对于HashSet可以保证数据的存储顺序

import com.whu.Instance.Student;

import java.util.LinkedHashSet;

public class LinkHashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhangsan", 22);

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        System.out.println(lhs.add(s1) + " " + lhs.add(s2) + " " + lhs.add(s3) + " " + lhs.add(s4));

        System.out.println(lhs);
    }
}
