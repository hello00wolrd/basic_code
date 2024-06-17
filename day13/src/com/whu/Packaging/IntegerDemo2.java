package com.whu.Packaging;

public class IntegerDemo2 {
    public static void main(String[] args) {
//        把整数变成二进制,八进制,十六进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);

        String str2 = Integer.toOctalString(100);
        System.out.println(str2);

        String str3 = Integer.toHexString(100);
        System.out.println(str3);

//        可以把字符串转换成int型的整数
        String str4 = "123456";
        Integer i1 = Integer.parseInt(str4);
        System.out.println(i1);
        System.out.println(i1 + 1);

//        八种包装类中,除了Character都有对应的parseXXX的方法,进行类型转换
        String str5 = "true";
        Boolean b1 = Boolean.parseBoolean(str5);
        System.out.println(b1);
    }
}
