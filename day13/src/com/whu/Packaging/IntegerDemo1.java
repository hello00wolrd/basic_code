package com.whu.Packaging;

//包装类:基本数据类型对应的引用类型
public class IntegerDemo1 {
    public static void main(String[] args) {
//      在JDK5中提出了一个机制,自动装箱和自动拆箱
//       自动装箱:把基本数据类型自动变成其对应的包装类
//        自动拆箱:把包装类自动变成其对象对应的基本数据类型

//        自动装箱
        Integer i1 = 1000;

//        自动拆箱
        int i2 = i1;
        System.out.println(i1);
        System.out.println(i2);
    }
}
