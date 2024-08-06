package com.whu.TreeMapDemo;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo3 {
    public static void main(String[] args) {
//        definition string
        String s = "aabbdcbdaaabcddddccccd";

//        creat the collection
        TreeMap<Character, Integer> tm = new TreeMap<>();

//        Get the Character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tm.containsKey(c)) {
                tm.put(c, tm.get(c) + 1);
            } else {
                tm.put(c, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });
//        Print out the result
        System.out.println(sb);
    }
}
