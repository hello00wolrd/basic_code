package com.cug.objectDemo;

import com.google.gson.Gson;

public class objectDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        user u1 = new user(1234, "张三", "123456", "path111", data);
//        克隆
//        细节：
//        重写object中的clone方法
//        让JavaBean类实现Cloneable接口
//        创建原对象并调用clone就可以了
        user u2 = (user) u1.clone();
        System.out.println(u1);
        System.out.println(u2);
//        验证object中的克隆是浅克隆
        int[] arr = u1.getData();
        arr[0] = 100;
        System.out.println(u1);
        System.out.println(u2);

//        第三方工具gson
//        把对象变成json形式字符串
        Gson gson = new Gson();
        String s = gson.toJson(u1);
        System.out.println(s);
//        把字符串变成对象
        user user = gson.fromJson(s, user.class);
        System.out.println(user);
//        Objects是一个工具类有以下方法:
//        isNull
//        nonNull
//        equals,先做非空判断再来比较两个对象
    }
}
