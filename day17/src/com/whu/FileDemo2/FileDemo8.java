package com.whu.FileDemo2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//统计文件夹内各个后缀名文件的个数
public class FileDemo8 {
    public static void main(String[] args) {
        File f1 = new File("E:\\电子书");
        HashMap<String, Integer> result = getCount(f1);
        System.out.println(result);
    }

    public static HashMap<String, Integer> getCount(File src) {
//        定义一个集合用来统计
        HashMap<String, Integer> hm = new HashMap<>();
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    String[] arr = name.split("\\.");
                    if (arr.length >= 2) {
                        String endName = arr[arr.length - 1];
                        if (!hm.containsKey(endName)) {
                            hm.put(endName, 1);
                        } else {
                            hm.put(endName, hm.get(endName) + 1);
                        }
                    }
                } else {
//                    子文件夹中的每一种文件的个数
                    HashMap<String, Integer> sonMap = getCount(file);
//                遍历sonMap把数据添加到hm中
                    Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                    for (Map.Entry<String, Integer> entry : entries) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        if (hm.containsKey(key)) {
                            hm.put(key, hm.get(key) + value);
                        } else {
                            hm.put(key, value);
                        }
                    }

                }
            }
        }

        return hm;
    }
}
