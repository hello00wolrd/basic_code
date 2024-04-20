package com.cug.StringJoiner;
//方便按一定规则拼接字符串，有间隔符号，起始符号，拼接符号

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
//        分隔符,前缀,后缀
        sj.add("1").add("2").add("3").add("4").add("5").add("6").add("7");
        System.out.println(sj);
    }
}
