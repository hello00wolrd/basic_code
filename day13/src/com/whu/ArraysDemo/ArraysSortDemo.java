package com.whu.ArraysDemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {
    public static void main(String[] args) {
        Integer[] arr = {134, 173, 216, 433, 709, 972, 1075, 1203, 1576, 1831};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
/*
* 返回负整数：如果第一个对象（o1）小于第二个对象（o2），根据排序顺序应该排在前面。
返回零：如果两个对象相等，在排序中它们的位置无所谓,默认放在后面。
返回正整数：如果第一个对象（o1）大于第二个对象（o2），根据排序顺序应该排在后面。
* */
            public int compare(Integer o1, Integer o2) {
                System.out.println("-----------");
                System.out.println("o1 :" + o1);
                System.out.println("o2:" + o2);
                return o1 - o2;
            }
        });
//        lambda
//Lambda表达式可以用来简化匿名内部类的书写
//
//Lambda表达式只能简化函数式接口的匿名内部类的写法
//
//函数式接口： 有且只有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解
        Arrays.sort(arr,(integer, integer2) -> integer - integer2);
        System.out.println(Arrays.toString(arr));
    }
}
