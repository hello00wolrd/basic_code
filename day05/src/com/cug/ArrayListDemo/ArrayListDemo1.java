package com.cug.ArrayListDemo;

import java.util.ArrayList;

//集合可以自动扩容
//集合不可以存引用数据类型
//基本数据类型要变成包装类才可以
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//尖括号内是泛型
        System.out.println(list);//做了一些底层处理打印出来不是地址值
        boolean result = list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(result);
        System.out.println(list);
        String str = list.remove(2);
        System.out.println(str);
        System.out.println(list);
    }
}
