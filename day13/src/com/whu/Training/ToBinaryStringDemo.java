package com.whu.Training;

public class ToBinaryStringDemo {
    public static void main(String[] args) {
        System.out.println(toBinaryString(7));
    }

    public static String toBinaryString(int n) {
//        StringBuilder来拼接余数
        StringBuilder sb = new StringBuilder();
//        利用循环不断的获取余数

        while (n != 0) {
//            记录余数
            int reminder = n % 2;
//            System.out.println(reminder);
//            倒着拼接
            sb.insert(0, reminder);
            n = n / 2;
        }
        return sb.toString();
    }
}
