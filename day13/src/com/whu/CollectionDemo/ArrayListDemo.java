package com.whu.CollectionDemo;

import java.util.ArrayList;
/*
ArrayList原理
①利用空参创建的集合，在底层创建一个默认长度为0的数组
②添加第一个元素时，底层会创建一个新的长度为10的数组
③存满时，会扩容1.5倍
* */


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        System.out.println(list1);
        System.out.println(list2);
    }
}
