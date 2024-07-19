package com.whu.FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo4 {
    /*
    *   1.引用静态方法
        类名::静态方法
        2.引用成员方法
        对象::成员方法
        this::成员方法
        super::成员方法
        3.引用构造方法
        类名::new
        4.使用类名引用成员方法
        类名::成员方法
        5.引用数组的构造方法
        数据类型[]::new
    * */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

//        收集到数组中
        Integer[] newArray = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(newArray));
    }
}
