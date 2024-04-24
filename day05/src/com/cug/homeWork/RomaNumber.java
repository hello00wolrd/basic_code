package com.cug.homeWork;

import java.util.Scanner;
import java.util.StringJoiner;

public class RomaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            str = sc.next();
            boolean flag = isNumber(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入不合格,重新输入");
                continue;
            }
        }
        str = changeRomaNumber(str);
        System.out.println(str);
    }

    public static String changeRomaNumber(String str) {
        String[] changeTable = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringJoiner sb = new StringJoiner(" ", "[", "]");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.add(changeTable[ch - '0']);
        }
        return sb.toString();
    }

    public static boolean isNumber(String str) {
        if (str.length() > 9) return false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') return false;//不是数字返回false
        }
        return true;
    }
}
