package com.whu.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

//      利用匿名内部类的形式
//      底层原理:
//      其实也会自己遍历集合，依次得到每一个元素
//      把得到的每一个元素，传递给下面的accept方法
//      s依次表示集合中的每一个数据
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        });

//        lambda表达式
        coll.forEach(s-> System.out.println(s));
    }
}
