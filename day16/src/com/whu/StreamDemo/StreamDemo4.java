package com.whu.StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arr2 = {"a", "b", "c"};

        Arrays.stream(arr1).forEach(System.out::println);
        System.out.println("=========================");
        Arrays.stream(arr2).forEach(System.out::println);
        System.out.println("=========================");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a-1", "b-2", "c-3");
//        map方法可以转换流中的数据类型
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String str) {
                String[] arr = str.split("-");
                String argString = arr[1];
                int age = Integer.parseInt(argString);
                return age;
            }
        }).forEach(s -> System.out.println(s));
        System.out.println("=========================");
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));
    }
}
