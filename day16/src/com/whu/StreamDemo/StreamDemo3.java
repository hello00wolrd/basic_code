package com.whu.StreamDemo;

import java.util.HashMap;

public class StreamDemo3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("aaa", 111);
        hm.put("bbb", 222);
        hm.put("ccc", 333);
        hm.put("ddd", 444);

        hm.keySet().stream().forEach(key -> {
            System.out.println(key + ":" + hm.get(key));
        });
        System.out.println("---------------");
        hm.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        });
    }
}
