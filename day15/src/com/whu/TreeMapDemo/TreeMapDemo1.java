package com.whu.TreeMapDemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
//        Add Collection Objects
        tm.put(2,"b");
        tm.put(3,"c");
        tm.put(4,"d");
        tm.put(5,"e");
        tm.put(1,"a");

//        print out
        System.out.println(tm);
    }
}
