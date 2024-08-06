package com.whu.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestDemo2 {
    public static void main(String[] args) {
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList, "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰");
        Collections.addAll(girlList, "杜琦燕", "袁明媛", "李财", "甜蜜蜜");

        ArrayList<Integer> RandomList = new ArrayList<>();
        Collections.addAll(RandomList, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(RandomList, 0, 0, 0);

        Collections.shuffle(RandomList);
        int result = RandomList.get(0);
        Random r = new Random();
        if (result == 1) {
            int boyIndex = r.nextInt(boyList.size());
            System.out.println("boy: " + boyList.get(boyIndex));
        } else {
            int girlIndex = r.nextInt(girlList.size());
            System.out.println("girl: " + girlList.get(girlIndex));
        }

    }
}
