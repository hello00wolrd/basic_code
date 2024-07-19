package com.whu.ExceptionDemo;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        int[] arr = {};
        try {
            int max = getMax(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        主程序中的执行也不会执行
        System.out.println("主程序中的执行");
    }

    private static int getMax(int[] arr) {
        if (arr == null) {
//            手动创造一个异常对象,并把异常交给方法的调用
//            此时方法结束,下面不会执行
            throw new NullPointerException();
        } else if (arr.length == 0) {
            throw new IndexOutOfBoundsException();
        }
        System.out.println("看看我执行了吗");
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
