package com.whu.ArgsDemo;

public class ArgsDemo1 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 34, 5, 6));
    }

    //  可变参数的实验
//    细节:
//      在方法的形参中只能写一个可变参数
//    在方法中,如果除了可变参数以外,还有其他形参,那么可变参数要写在最后
    public static int getSum(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
