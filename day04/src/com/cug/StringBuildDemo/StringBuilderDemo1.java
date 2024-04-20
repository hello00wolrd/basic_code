package com.cug.StringBuildDemo;

/*
 * StringBuilder
 * 由于java中的String是不可变的,每次使用"+"拼接的时候会消耗大量内存和时间,性能不好
 * 而StringBuilder和cpp中一样是容器.效率高
 * */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a哈哈哈");
        System.out.println(sb);//打印的属性值,不是地址值
        for (int i = 0; i < 100; i++) {
            sb.append("a");
        }
        sb.reverse();//反转
        System.out.println(sb);
        System.out.println(sb.length());
        String str = sb.toString();
        System.out.println(str);
//        链式编程
        int len = sb.substring(1).replace("a", "1").length();
        System.out.println(sb.toString().replace("a", "1"));
    }
}
