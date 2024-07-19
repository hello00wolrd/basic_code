package com.whu.ExceptionDemo;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[6]);
        }catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
        System.out.println("Am I operated?");
    }
}
