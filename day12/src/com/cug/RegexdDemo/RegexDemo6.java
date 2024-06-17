package com.cug.RegexdDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {
        String str = "java自从95年问世以来,abbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaa，经历了很多版本，目前企业中用的最多的是JAva8和JaVa11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是JavA17，相信在未来不久Java17也会逐渐登上历史舞台";

        /*
         * 贪婪爬取:在爬取数据时尽可能多的获取数据
         * 非贪婪爬取:再爬取数据时尽可能少的获取数据
         * java中默认的就是贪婪爬取
         * */
        String regex = "ab+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
//            贪婪爬取尝试
            System.out.println(m.group());
        }
        String regex2 = "ab+?";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2= p2.matcher(str);
        while (m2.find()) {
//            尝试非贪婪爬取
            System.out.println(m2.group());
        }

    }
}
