package com.whu.a02Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* 现在有两个ArrayList集合，分别存储6名男演员的名字和年龄以及6名女演员的名字和年龄。姓名和年龄中间用逗号隔开。
比如: 张三,23
要求完成如下的操作:
1，男演员只要名字为3个字的前两人
2，女演员只要姓杨的，并且不要第一个
3，把过滤后的男演员姓名和女演员姓名合并到一起
4，将上一步的演员姓名封装成Actor对象。
5，将所有的演员对象都保存到List集合中。
备注: 演员类Actor，属性有: name，age
男演员: "蔡坤坤,24", "叶茑威,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27"
女演员: "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33"

* */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1, "蔡坤坤,24", "叶茑威,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(list2, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        Stream<String> men = list1.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        Stream<String> women = list2.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1);

//        合并两个流
        List<Actor> AllActor = Stream.concat(men, women).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Actor(name, age);
            }
        }).collect(Collectors.toList());
        System.out.println(AllActor);
    }
}
