package com.whu.FunctionDemo;

import java.util.Arrays;

public class FunctionDemo1 {
    public static void main(String[] args) {
//        方法引用引用处需要是函数式接口,被引用的方法需要已经存在
//        被引用的方法的形参和返回值需要和抽象方法的一致
//        被引用方法的功能需要满足当前的要求

        Integer[] arr ={1,2,3,4,5};
//        方法引用
        Arrays.sort(arr,FunctionDemo1::subtraction);
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
}
