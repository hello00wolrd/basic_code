package com.cug.BigInter;

import java.math.BigInteger;

public class bigIntegerDemo2 {
    public static void main(String[] args) {
//        创建两个biginteger对象
        BigInteger a = new BigInteger("10");
        BigInteger b = new BigInteger("5");
//        加法
        BigInteger c = a.add(b);
        System.out.println(c);
//        除法,商数和余数
        BigInteger[] arr = a.divideAndRemainder(b);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
//        是否相同
        System.out.println(a.equals(b));
//        次幂
        System.out.println(a.pow(2));
//        max
        System.out.println(a.max(b));
//        返回int类型
        int d = a.intValue();
        System.out.println(d);
//        返回long类型的
        long e = a.longValue();
        System.out.println(e);
    }
}
