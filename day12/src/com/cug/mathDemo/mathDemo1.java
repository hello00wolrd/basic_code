package com.cug.mathDemo;

public class mathDemo1 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-88));
//        有个小bug,如果没有负数对应,那么会产生错误.以int型为例
        System.out.println(Math.abs(-2147483648));
//        System.out.println(Math.absExact(-2147483648));
        System.out.println(Math.ceil(12.3));
//        向上取整
        System.out.println(Math.floor(12.3));
//        向下取整
        System.out.println(Math.round(12.4));
        System.out.println(Math.round(12.6));
//        四舍五入
    }
}
