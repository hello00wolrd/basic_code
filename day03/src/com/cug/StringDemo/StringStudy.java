package com.cug.StringDemo;

public class StringStudy {
    public static void main(String[] args) {
        String s1 = "java";//在字符串池中
        System.out.println(s1);

        String s2 = new String();//堆中
        System.out.println("!" + s2 + "@");

        String s3 = new String("abcd");
        System.out.println(s3);

        char[] c1 = {'a', 'b', 'c'};//堆空间中
        String s4 = new String(c1);
        System.out.println(s4);

        byte[] b1 = {97, 98, 99, 100};
        String s5 = new String(b1);
        System.out.println(s5);//把字节信息改成string

        String s6 = new String("abc");
        String s7 = "abc";
        System.out.println(s6 == s7);//false
//        两个串分别在不同区（池）中  地址不相同
        System.out.println(s6.equals(s7));//内容比较，区分大小写
        System.out.println(s6.equalsIgnoreCase(s7));//不区分大小写
    }
}
