package com.whu.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /*Collection
            List（有序、可重复、有索引）
                ArrayList
                LinkedList
                Vector
            Set（无序、不可重复）
                HashSet
                TreeSet
            LinkedHashSet（有序、不可重复、有索引）*/


        Collection<String> coll = new ArrayList<>();

//        添加元素
        coll.add("a");
        coll.add("b");
        coll.add("c");
        System.out.println(coll);
        //细节1：如果我们要在List系列集合中添加数据，那么方法永远返回true，因为List系列的是允许元素重复的。
        //细节2：如果我们往Set系列集合中添加数据，如果当前要添加元素不存在，方法返回true，表示添加成功。

//        清空
//        coll.clear();
//        System.out.println(coll);

//        delete
        coll.remove("a");
        System.out.println(coll);
//        contains
//        4.判断元素是否包含
//        细节：底层是依赖equals方法进行判断是否存在
//        所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，那么在java bean类中，一定要重写equals方法。
        System.out.println(coll.contains("a"));

    }
}
