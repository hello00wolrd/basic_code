package com.whu.ExceptionDemo;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[90]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = e.getMessage();
            System.out.println(message);

            String s= e.toString();
            System.out.println(s);

            e.printStackTrace();
//            把异常的错误信息输出到控制台，但是并不会停止程序运行
        }
        System.out.println("hello");
        System.err.println("Hello");
//        err可以以红色的字体打印出来错误信息
    }
}
