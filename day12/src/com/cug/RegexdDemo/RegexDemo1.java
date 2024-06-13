package com.cug.RegexdDemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        String qq = "1234567890";
//        System.out.println(CheckQQ(qq));
//        正则表达式的形式
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
    }

    private static boolean CheckQQ(String qq) {
//        六位到20位之间,不能是0开头
        int len = qq.length();
        if (len < 6 || len > 20) {
            return false;
        }
        if (qq.startsWith("0")) return false;
        for (int i = 0; i < len; i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') return false;
        }
        return true;
    }
}
