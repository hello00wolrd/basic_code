package com.cug.RegexdDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        String str = "java自从95年问世以来，经历了很多版本，目前企业中用的最多的是JAva8和JaVa11，因为这两个是长期支持版本，下一个长期支持版本是JavA17，相信在未来不久Java17也会逐渐登上历史舞台";
//        ?可以理解为前面的数据Java
//        =表示在Java后面要跟随的数据
//        但是在获取的时候,只获取前半部分
        String regex = "((?i)Java)(?=8|11|17)";
//        爬取带数字的java
        String regex1 = "((?i)Java)(8|11|17)";
//爬取不带8,11,17的java
        String regex2 = "((?i)Java)(?!8|11|17)";
        Pattern p = Pattern.compile(regex2);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
