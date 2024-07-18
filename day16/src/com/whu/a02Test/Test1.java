package com.whu.a02Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
//定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
//过滤奇数，只留下偶数。
//并将结果保存起来
        Set<Integer> set = new HashSet<Integer>();
        Collections.addAll(set, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        set.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 2 == 0;
            }
        }).forEach(i -> System.out.println(i));


        Set<Integer> newSet = set.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());
        System.out.println(newSet);
    }
}
