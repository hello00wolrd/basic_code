package com.cug.ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*基本数据类型对应的包装类
        byte    Byte
        short   Short
        char    Character
        int     Integer
        long    Long
        float   Float
        double  Double
        boolean Boolean
        * */
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        stu.setAge(sc.nextInt());
        stu.setName(sc.next());
        list.add(stu);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(0).toString());
        System.exit(0);
    }
}
