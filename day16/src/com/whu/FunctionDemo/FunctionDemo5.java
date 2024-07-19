package com.whu.FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan-12", "lisi-90", "wangwu-12", "zhaoliu-12");
//        先变成student对象,再把student对象收集起来
        Student[] newArrays = list.stream().map(Student::new).toArray(Student[]::new);

        System.out.println(Arrays.toString(newArrays));
    }
}
