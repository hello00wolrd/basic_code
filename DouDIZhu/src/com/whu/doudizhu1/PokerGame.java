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
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

//        遍历牌盒得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i <= 2) {
//                地主底牌
                lord.add(poker);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }
        //            看牌
        lookPoker("community card", lord);
        lookPoker("player1", player1);
        lookPoker("player2", player2);
        lookPoker("player3", player3);
    }

    //    看牌
    public void lookPoker(String name, ArrayList<String> list) {
        System.out.println(name + ": ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
