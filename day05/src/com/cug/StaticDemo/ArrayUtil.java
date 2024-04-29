package com.cug.StaticDemo;

import java.util.StringJoiner;

/*
 * 静态方法,只能访问静态
 * 非静态方法可以访问所有
 * 静态方法中没有this关键字
 * */
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
