package com.cug.RegexdDemo;

public class RegexDemo7 {
    public static void main(String[] args) {
        String str = "小诗诗dqwefqwfqwfwg12312小丹丹dqwefqwfqwfwg12312小惠惠";
        String result = str.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result);
//split 方法的使用
        String[] arr = str.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
