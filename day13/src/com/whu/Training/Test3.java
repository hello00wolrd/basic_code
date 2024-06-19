package com.whu.Training;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getAns(1));
    }

    public static int getAns(int day) {
        if (day == 10) {
            return 1;
        } else {
            return (getAns(day + 1) + 1) * 2;
        }
    }
}
