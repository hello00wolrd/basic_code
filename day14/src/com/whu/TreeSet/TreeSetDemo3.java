package com.whu.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

//comparator sort
public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
//            o1 : the new element
//            o2 : has been in red-black tree ,which used to compare .
            public int compare(String o1, String o2) {
//                to achieve the ascending sort
                int i = o1.length() - o2.length();
                return i != 0 ? i : o1.compareTo(o2);
            }
        });
//            add the elements
        ts.add("A");
        ts.add("abcdefg");
        ts.add("defg");
        ts.add("ghi");
        ts.add("jklasdajhg");

//        print the result
        System.out.println(ts);

    }
}
