package com.cug.StaticDemo;

import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil() {
    }

    public static String arrPrint(int[] arr) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i : arr) {
            sj.add(Integer.toString(i));
        }
        return sj.toString();
    }

    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }
}
