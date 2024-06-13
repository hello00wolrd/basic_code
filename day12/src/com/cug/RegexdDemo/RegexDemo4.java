package com.cug.RegexdDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) {
        /*
    来黑马程序员学习Java
电话:18512516758，18512508907
或者联系邮箱:boniu@itcast.cn，
座机电话:01036517895，010-98951256
邮箱:bozai@itcast.cn
热线电话:400-618-9090，400-618-4000，4006184000，4006189090
        */
        String s1 = "来黑马程序员学习Java\n" +
                "电话:18512516758，18512508907\n" +
                "或者联系邮箱:boniu@itcast.cn，\n" +
                "座机电话:01036517895，010-98951256\n" +
                "邮箱:bozai@itcast.cn\n" +
                "热线电话:400-618-9090，400-618-4000，4006184000，4006189090";
        String regexTelephone = "((?:(?:\\+|00)86)?1(?:(?:3[\\d])|(?:4[5-79])|(?:5[0-35-9])|(?:6[5-7])|(?:7[0-8])|(?:8[\\d])|(?:9[189]))\\d{8})" +
                "|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})" +
                "|((?:(?:\\d{3}-?)?\\d{8}|^(?:\\d{4}-)?\\d{7,8})(?:-\\d+)?)";
//        System.out.println("18512516758".matches(regexTelephone));
        Pattern p = Pattern.compile(regexTelephone);
        Matcher m = p.matcher(s1);
        while (m.find()) {
            String s2 = m.group();
            System.out.println(s2);
        }
    }
}
