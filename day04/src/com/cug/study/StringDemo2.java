package com.cug.study;

public class StringDemo2 {
    public static void main(String[] args) {
        String phonenumber = "13189179963";//虚构的号码
        String result = phonenumber.substring(0, 3);
        System.out.println(result);
        String result2 = phonenumber.substring(7);
        System.out.println(result + "****" + result2);
    }

}
