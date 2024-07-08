package com.whu.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
//        creat a map object
        Map<String, String> m = new HashMap<String, String>();
//        add the element
        System.out.println(m.put("Alice", "Bob"));
        m.put("putin", "trump");
        m.put("man", "woman");
        System.out.println(m.put("Alice", "Boom"));
//        在添加对象的时候，若键不存在，那么直接把键值对对象添加到map集合中，方法返回null
//        在添加数据的时候，若键是存在的，那么会把原有的键值对对象覆盖，然后会把被覆盖的值进行返回
        System.out.println(m);
//        When a key is deleted, the value will be return
        System.out.println(m.remove("putin"));
        System.out.println(m);

//        m.clear();
//        System.out.println(m);

//        Judge whether it contains key/value?
        boolean keyResult = m.containsKey("Alice");
        System.out.println(keyResult);

        boolean valueResult = m.containsValue("Boom");
        System.out.println(valueResult);
    }
}
