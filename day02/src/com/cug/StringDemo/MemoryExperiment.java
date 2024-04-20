package com.cug.StringDemo;

import java.util.Random;

//java中new出来的都在堆区
public class MemoryExperiment {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            Random rd = new Random();
            int temp = rd.nextInt(100);
            arr1[i] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int[] arr2 = arr1;//arr2和arr1指向同一个数组
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
