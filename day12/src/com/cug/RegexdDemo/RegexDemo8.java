package com.cug.RegexdDemo;

public class RegexDemo8 {
    public static void main(String[] args) {
//        判断一个字符串的开始字符与结束字符是否一致
//        举例:
//        \\组号:     表示把第X组的内容拿出来再用一次
        String regex1 = "(.).+\\1";
        System.out.println("ahhbdahjba".matches(regex1));
        System.out.println("abbbc".matches(regex1));
//        判断一个字符串开始和结束部分是否一致,开始部分与结束部分可以多个字符
        String regex2 = "(.+).+\\1";
        System.out.println("abcdsadklkabc".matches(regex2));
//        判断字符串开始和结束部分是否一致,开始部分内部每个字符也需要一致
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("abcddabc".matches(regex3));
        System.out.println("aaabbccbaaa".matches(regex3));
//        替换口吃
//        在正则内部可以使用   \\组号       在正则外部可以使用   $组号
        String str1 = "我要学学学学学学学学学习习习习习习习习习习习习习习习习习习";
        String result = str1.replaceAll("(.)\\1+", "$1");
        System.out.println(result);

    }
}
