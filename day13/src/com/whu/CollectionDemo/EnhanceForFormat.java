package com.whu.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class EnhanceForFormat {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

//        s是一个第三方的变量

//        修改增强for中的变量不会改变集合中原本的数据
        for (String s : coll) {
            s= "qqqq";
        }
        System.out.println(coll);

    }
}
