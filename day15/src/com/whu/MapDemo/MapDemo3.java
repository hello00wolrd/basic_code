package com.whu.MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("标枪选手", "马超");
        map.put("人物挂件", "明世隐");
        map.put("御龙骑士", "尹志平");
//        通过键值对遍历
//        通过一个方法获取所有的键值对对象,返回一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
//         遍历entries这个集合,得到里面每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
//            在增强for内部利用entry调用get方法获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("-----------------------");
//        迭代器形式的遍历
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("-----------------------");
//        lambda形式的遍历
        entries.forEach(entry-> System.out.println(entry.getKey() + "=" + entry.getValue()));
    }
}
