package com.whu.MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
//        creat a map object
        Map<String, String> m = new HashMap<String, String>();
//        add the element
        System.out.println(m.put("Alice", "Bob"));
        m.put("putin", "trump");
        m.put("man", "woman");
        System.out.println(m.put("Alice", "Boom"));
        System.out.println("-----------------------");
//        获取所有的键，把键放到单列集合中
        Set<String> keys = m.keySet();
//        增强for
        for (String key : keys) {
//            System.out.println(key + ":" + m.get(key));
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }
//        lambda表达式形式
        keys.forEach(key-> System.out.println(key+":"+m.get(key)));
        System.out.println("-----------------------");
//        迭代器形式
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = m.get(key);
            System.out.println(key+"="+value);
        }
    }
}
