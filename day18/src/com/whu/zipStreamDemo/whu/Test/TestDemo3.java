package com.whu.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");

//        随机点名
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            rollCall(list);
        }
    }

    private static void rollCall(ArrayList<String> list) {
        Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);
        list.remove(name);
    }
}
