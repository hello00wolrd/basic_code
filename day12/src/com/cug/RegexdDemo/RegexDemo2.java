package com.cug.RegexdDemo;

public class RegexDemo2 {
    public static void main(String[] args) {
//        验证手机号
        String regex1 = "1[3-9]\\d{9}]";
//        验证座机号码
        String regex2 = "0\\d{2,3}-?[\\d&&[^0]]\\d{4,9}";
//        验证邮箱
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("1234567890@qq.com".matches(regex3));
//      插件  any-rule    alt+a的话可以直接插入
        String regex4 = "(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        System.out.println("12:23:31".matches(regex4));
//        身份证的简单校验
//        18位,前17位为任意数字首位不能是0,最后一位可以是数字或者是X或者是x
        String regex5 = "[1-9]\\d{16}(\\d|X|x)";
        System.out.println("666666666666666666".matches(regex5));
//        忽略大小写的方式
        String regex6 = "(?i)abc";
        System.out.println("abc".matches(regex6));
        System.out.println("ABC".matches(regex6));
        System.out.println("aBc".matches(regex6));
    }
}
