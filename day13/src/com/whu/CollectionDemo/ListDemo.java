package com.whu.CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("zhangsan");
        ls.add("lisi");
        ls.add("wangwu");

//        add
        ls.add(1, "zhaoliu");
        System.out.println(ls);
//        remove采用索引使用会返回一个string数组
        String s = ls.remove(0);
        System.out.println(s);
        System.out.println(ls);




        //1.创建集合并添加元素
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//2.删除元素
//请问：此时删除的是1这个元素，还是1索引上的元素？
//为什么？
//因为在调用方法的时候，如果方法出现了重载现象
//优先调用，实参跟形参类型一致的那个方法。
//list.remove(1);

//手动装箱，手动把基本数据类型的1，变成Integer类型
        Integer i = Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);
    }
}
