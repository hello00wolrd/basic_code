package com.cug.StringJoiner;
//"+"会带来极差的性能，一般在开发中不建议使用

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
//        分隔符,前缀,后缀
        sj.add("1").add("2").add("3").add("4").add("5").add("6").add("7");
        System.out.println(sj);
        System.out.println(sj.length());
        System.out.println(sj.toString());
    }
}
