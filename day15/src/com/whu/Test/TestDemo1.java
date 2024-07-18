package com.whu.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");
//        System.out.println(list);
        Random r = new Random();
        int index = r.nextInt(list.size());
        String out = list.get(index);
        System.out.println(out);

        Collections.shuffle(list);
        out = list.get(0);
        System.out.println(out);
    }
}
