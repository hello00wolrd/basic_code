package com.whu.ImmutableDemo1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo1 {
    public static void main(String[] args) {
//        不可变list集合
        List<String> list = List.of("zhangsan", "lisi", "wangwu", "zhaoliu");
        System.out.println(list);

//          set
        Set<String> set = Set.of("zhangsan", "lisi", "wangwu", "zhaoliu");
        System.out.println(set);
//        set.remove("zhangsan");
//        map,有上限的,没有设置可变参数的方法
        Map<String, String> map = Map.of("zhangsan", "lisi", "wangwu", "zhaoliu");
        System.out.println(map);


        HashMap<String, String> hm = new HashMap<>();
        hm.put("zhangsan", "lisi");
        hm.put("wangwu", "zhaoliu");
        hm.put("zhaoliu", "lisi");
        hm.put("zhangsa11n", "lisi");
        hm.put("wangwu2123", "lisi");
        Map<String, String> map1 = Map.copyOf(hm);
        System.out.println(map1);
    }
}
