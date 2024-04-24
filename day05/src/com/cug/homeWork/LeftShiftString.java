package com.cug.homeWork;

import java.util.Scanner;

public class LeftShiftString {
    public static void main(String[] args) {
        String aStr, bStr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: A");
        aStr = sc.nextLine();
        System.out.println("Enter the string: B");
        bStr = sc.nextLine();
        if (aStr.length() != bStr.length()) {
            System.out.println("A不能旋转达到B");
            return;
        } else {
            for (int i = 0; i < aStr.length(); i++) {
                if (aStr.equals(bStr)) {
                    System.out.println("经过" + i + "次旋转,A可以变成B");
                    return;
                }
                char firstChar = aStr.charAt(0);
                String end = aStr.substring(1);
                aStr = end + firstChar;
            }
            System.out.println("A不能到达B");
        }
    }
}
