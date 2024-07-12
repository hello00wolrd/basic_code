package com.whu.HashMapDemo;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
//        store the 4 scenic spot
        String[] str = {"A", "B", "C", "D"};

//        利用随机数模拟80个同学的投票,并且把投票的结果都存起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(str.length);
            list.add(str[index]);
        }
//        System.out.println(list);
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (hm.containsKey(name)) {
                int count = hm.get(name);
                count++;
                hm.put(name, count);
            } else {
                hm.put(name, 1);
            }
        }
        System.out.println(hm);

//        Get Maximize
        int max = 0;
        Set<Map.Entry<String, Integer>> set = hm.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        System.out.println(max);
        System.out.println("-----------------------");

//        LinkedHashMap can explicit the order
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("A", 1);
        lhm.put("B", 2);
        lhm.put("sda", 3);
        lhm.put("yuadbw", 4);
        lhm.put("A", 5);
        System.out.println(lhm);
    }
}
