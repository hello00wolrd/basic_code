package com.whu.StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
//        单列集合获取stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n");

        Stream<String> listStream = list.stream();
        listStream.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.print(string);
            }
        });
        System.out.println();
        list.stream().forEach(s -> System.out.print(s));
    }
}
