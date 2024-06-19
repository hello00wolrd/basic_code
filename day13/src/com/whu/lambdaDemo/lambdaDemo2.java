package com.whu.lambdaDemo;

import java.util.Arrays;

public class lambdaDemo2 {
    public static void main(String[] args) {
        String[] arr1 = {"这是一行文本aa", "这是第二行文本aaaa", "这是第三行文本asda", "这是第四行文本sadfasdf", "这是第五行文本sdfasdfas"};
//        按字符串长度从小到大排序
        Arrays.sort(arr1, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr1));

    }
}
