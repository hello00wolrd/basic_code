package com.cug.StringBuilderDemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());//容量
        System.out.println(sb.length());
        sb.append("abcdefghijklmnopqrstuvwxy");
        System.out.println(sb.capacity());//2*16+2
        sb.append("1234567890123984612384613289745635981936458796743985964798297684237841239768");
        System.out.println(sb.capacity()+"\t"+sb.length());

    }
}
