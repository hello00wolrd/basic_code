package com.cug.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

//小数的精确运算
//表示很大的小数
public class BigDecimalDemo1 {
    public static void main(String[] args) {
//        通过传递double类型的小数来创建对象
        BigDecimal bd1 = new BigDecimal(0.1);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);
//      通过传递字符串创建对象
        BigDecimal bd3 = new BigDecimal("10");
        BigDecimal bd4 = new BigDecimal("3");
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd3.add(bd4));
//      通过静态方法创建对象
        BigDecimal bd5 = BigDecimal.valueOf(0.98);
        System.out.println(bd5);
//        除法
        BigDecimal bd6 = bd3.divide(bd4, 2, RoundingMode.HALF_UP);
        System.out.println(bd6);
    }
}
