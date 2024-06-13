package com.cug.RegexdDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        /*
        Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Jva11，因为这
两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
*/
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Jva11，因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台 ";
        method1(str);

    }

    private static void method1(String str) {
        //        获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");

//         获取文本匹配器的对象
//        m:文本匹配器的对象
//        str:大串
//        p:规则
//        m要在str中找符合p规则的小串
        Matcher m = p.matcher(str);

////        检查串内是否有符合文本匹配器的子串,如果有则返回true,如果没有则返回false,并且记录底层的子串的初始索引和结束索引+1,左闭右开
//        boolean b = m.find();
////        方法底层会根据find方法的记录的索引进行字符串的截取,substring
////        把截取的小串返回
//        String s1 = m.group();
//        System.out.println(s1);
//        利用循环来改进获取
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }
    }
}
