package com.whu.Map;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        ArrayList<String> city1 = new ArrayList<>();
        Collections.addAll(city1, "Nanjing", "Yangzhou", "Suzhou", "Wuxi", "Changzhou");
        ArrayList<String> city2 = new ArrayList<>();
        Collections.addAll(city2, "Wuhan", "Xiaogan", "Shiyan", "Yichang");
        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city3, "Shijiazhuang", "Tangshan", "Xingtai", "Baoding", "Zhangjiakou");

        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        hm.put("Jiangsu", city1);
        hm.put("Hubei", city2);
        hm.put("Hebei", city3);

        Set<Map.Entry<String, ArrayList<String>>> st = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : st) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
