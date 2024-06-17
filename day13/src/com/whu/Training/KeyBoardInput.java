package com.whu.Training;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyBoardInput {
    public static void main(String[] args) {
        ArrayList<Integer> arrayInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String StrNum = sc.nextLine();
            int num = Integer.parseInt(StrNum);
            if (num < 1 || num > 100) {
                System.out.println("The current data range is abnormal");
                continue;
            } else {
//                触发了自动装箱
                arrayInteger.add(num);
                int sum = getSum(arrayInteger);
                if (sum >200) {
                    System.out.println("The current data has already been satisfied");
                    break;
                }
            }
        }


    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
//            触发了自动拆箱
            Integer i1 = list.get(i);
            sum = sum + i1;
        }
        return sum;
    }
}
