package com.whu.FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6", "7", "8", "9");

//        全部变成int类型
        list.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
        System.out.println("======================================");
//        方法引用
        list.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}
