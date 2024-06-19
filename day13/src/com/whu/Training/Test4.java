package com.whu.Training;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(Fn(20));
    }

    public static int Fn(int step) {
        if (step == 1) return 1;
        if (step == 2) return 2;
        if (step == 3) return 4;
        return Fn(step - 1) + Fn(step - 2) + Fn(step - 3);
    }
}
