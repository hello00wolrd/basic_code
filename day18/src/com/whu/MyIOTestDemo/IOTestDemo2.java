package com.whu.MyIOTestDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class IOTestDemo2 {
    /*
需求：
有一个文件里面存储了班级同学的信息，每一个信息占一行。格式为：张三-男-23
要求通过程序实现随机点名器。
运行效果：
第一次运行程序：随机同学姓名1（只显示名字）
第二次运行程序：随机同学姓名2（只显示名字）
第三次运行程序：随机同学姓名3（只显示名字）
...

    * */
    public static void main(String[] args) throws IOException {
//    Here, use name.txt as the storage file first.
        File file = new File("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\MyIOTestDemo\\name.txt");
        String name = callRoll(file);
        System.out.println(name);
    }

    private static String callRoll(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        ArrayList<String> nameList = new ArrayList<>();
        while ((str = br.readLine()) != null) {
            String name = str.split("-")[0];
            nameList.add(name);
        }
        Random r = new Random();
        int index = r.nextInt(nameList.size());
        br.close();
        return nameList.get(index);
    }
//    done
}
