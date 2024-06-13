package com.cug.BigInter;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
//        获取一个随机的大整数
        BigInteger bd1 = new BigInteger(4, new Random());
        System.out.println(bd1);//0~2^4-1
//        获得确定的大数
        BigInteger bd2 = new BigInteger("123135434513986784568734");
        System.out.println(bd2);
//        指定进制的大整数
        BigInteger bd3 = new BigInteger("100", 2);
        System.out.println(bd3);
//        静态获取biginteger对象,内部有优化
        BigInteger bd5 = BigInteger.valueOf(100);
        System.out.println(bd5);
    }
}
