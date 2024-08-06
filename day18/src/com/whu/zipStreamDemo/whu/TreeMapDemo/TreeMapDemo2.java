package com.whu.TreeMapDemo;

import com.whu.Instance.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getAge() - o2.getAge();
                i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                return i;
            }
        });

        Student s1 = new Student("zhangsan", 24);
        Student s2 = new Student("lisi", 23);
        Student s3 = new Student("wangwu", 25);

        tm.put(s1, "Jiangsu");
        tm.put(s2, "Zhejiang");
        tm.put(s3, "Shanghai");

        System.out.println(tm);
    }
}
