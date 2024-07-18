package com.whu.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //        牌盒
    static ArrayList<String> list = new ArrayList<>();

    //    静态代码块
//    随着类的加载只加载一次,并且只执行一次
    static {
//准备牌
        String[] color = {"♦", "♣", "♠", "♥"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String c : color) {
//            c是花色
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("BigJoker");
        list.add("SmallJoker");
    }

    public PokerGame() {
//        洗牌
        Collections.shuffle(list);
//        发牌

//        看牌
        System.out.println(list);
    }
}
