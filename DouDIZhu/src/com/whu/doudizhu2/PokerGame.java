package com.whu.doudizhu2;

import java.util.*;

public class PokerGame {
    //        牌盒
    static HashMap<Integer, String> hm = new HashMap<>();
    //    利用键来代替扑克标号
    static ArrayList<Integer> list = new ArrayList<>();

    //    静态代码块
//    随着类的加载只加载一次,并且只执行一次
    static {
//准备牌
        String[] color = {"♦", "♣", "♠", "♥"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
//      给每张牌进行排序
        int serialNumber = 1;
        for (String c : color) {
            for (String n : number) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber, "BigJoker");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "SmallJoker");
        list.add(serialNumber);


//        System.out.println(hm);
//        System.out.println(list);
    }

    public PokerGame() {
//洗牌
        Collections.shuffle(list);
//       发牌
        TreeSet<Integer> communityCards = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (i < 3) {
                communityCards.add(list.get(i));
                continue;
            }
            if (i % 3 == 0) {
                player1.add(list.get(i));
            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else {
                player3.add(list.get(i));
            }
        }
//      看牌
        lookPoker("Community Card: ", communityCards);
        lookPoker("Player 1: ", player1);
        lookPoker("Player 2: ", player2);
        lookPoker("Player 3: ", player3);
    }

    public static void lookPoker(String name, TreeSet<Integer> list) {
        System.out.print(name + ":");
        for (int i : list) {
            String poker = hm.get(i);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
