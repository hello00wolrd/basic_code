package com.cug.objectDemo;

public class objectDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);//java.lang.Object@7ba4f24f
        teacher t1 = new teacher("wangwu", 18);
        System.out.println(t1.toString());
        teacher t2 = new teacher("wangwu", 18);
//        如果没有重写equals,那么会默认使用Object中的方法进行比较,比较的是地址值是否相等
//        一般来讲地址值对于我们的意义不大,所以我们会重写
        System.out.println(t2.equals(t1));
    }
}
