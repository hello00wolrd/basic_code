package com.whu.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
//        Iterator是集合专用的遍历方式
//        Iterator 不依赖索引

        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("d");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
//            next 方法的两件事情：获取元素并且移动指针
            System.out.println(it.next());
        }

//        当后面没有元素时会报错
//        NoSuchElementException
//        System.out.println(it.next());
//          迭代器遍历完毕，指针不会复位
//        迭代器遍历的时候，不能用集合的方法进行增加或者删除：若要删除可以使用迭代器的删除
        Iterator<String>it2  = coll.iterator();
        while (it2.hasNext()){
            String str = it2.next();
            if(str.equals("c")){
                it2.remove();
            }
        }
        System.out.println(coll);
    }
}
