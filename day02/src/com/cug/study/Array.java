package com.cug.study;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        double[] array2 = new double[]{1.1, 2.3, 3.2};
//        new可以取消
        int[] array3 = {1, 2, 3, 4, 5};
        System.out.println(array);//打印地址值[I@7ba4f24f
//        [:表示是个数组
//        I:表示是int型的
//        @:是个间隔符号
//        7ba4f24f才是真正的地址值
        System.out.println(array2[1]);//打印值
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        char[] char_arr = new char[100];
        System.out.println(char_arr.length);
        int[] int_arr = new int[100];
        Random rd = new Random();
        for (int i = 0; i < int_arr.length; i++) {
            int number = rd.nextInt(100);//在0-99之间获取随机数字
            int_arr[i] = number;
        }
        for (int i = 0; i < int_arr.length; i++) {
            System.out.print(int_arr[i] + " ");//输出随机数字
        }
        System.out.println();


        //下面为打乱数据的顺序
        int[] array4 = new int[5];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = i + 1;
        }
        for (int i = 0; i < array4.length; i++) {
            int temp = array4[i];
            int index = rd.nextInt(array4.length);
            array4[i] = array4[index];
            array4[index] = temp;
        }
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " ");//sout简写
        }
    }
}
