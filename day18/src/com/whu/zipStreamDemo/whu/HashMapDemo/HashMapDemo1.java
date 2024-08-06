package com.whu.HashMapDemo;

import com.whu.Instance.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

//        creat three "student" objects
        Student s1 = new Student("ZhangSan", 25);
        Student s2 = new Student("LiSi", 26);
        Student s3 = new Student("WangWu", 27);
//        Students with the same name and age will be considered as the same student.
        Student s4 = new Student("WangWu", 27);
//        add all the elements
        hm.put(s1, "JiangSu");
        hm.put(s2, "HeNan");
        hm.put(s3, "GuangDong");
        hm.put(s4, "ShanDong");

//        Traverse the collection
//        the main type
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println("key:" + key + " value:" + value);
        }
        System.out.println("-------------------------");
//        lambda type
        hm.forEach((k, v) ->
                System.out.println("Student:" + k + "Place of Origin: " + v));
//         iterator type
        System.out.println("-------------------------");
        Iterator<Map.Entry<Student, String>> it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Student, String> entry = it.next();
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + " value:" + value);
        }
    }
}
