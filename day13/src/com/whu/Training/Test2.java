package com.whu.Training;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(getSum(12));
    }

    public static int getSum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return getSum(month - 1) + getSum(month - 2);
        }
    }
}
