package com.whu.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

//基于红黑树存储
//不重复,可排序,无索引
public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);

        System.out.println(ts);

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            int i = (int) it.next();
            System.out.println(i);
        }
        System.out.println("--------------------");
        ts.forEach(System.out::println);
        System.out.println("--------------------");
        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}
