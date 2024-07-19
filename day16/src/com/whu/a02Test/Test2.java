package com.whu.a02Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan-1", "lisi-2", "wangwu-4");

        Map<String, String> NewMap = list.stream().filter(s -> Integer.parseInt(s.split("-")[1]) < 3)
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> s.split("-")[1]));

        System.out.println(NewMap);
    }
}
