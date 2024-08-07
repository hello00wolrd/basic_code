package com.whu.MyIOTestDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class IOTestDemo3 {
    /*
需求:
一个文件里面存储了班级同学的信息，每一个学生信息占一行。
格式为:张三-男-23。
要求通过程序实现随机点名器。
运行效果:
70%的概率随机到男生
30%的概率随机到女生
总共随机100万次，统计结果。
注意观察:看生成男生和女生的比例是不是接近于7:3

    * */
    public static void main(String[] args) throws IOException {
    /*
    Here, use name.txt as the storage file first.
    */
        File file = new File("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\MyIOTestDemo\\name.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        ArrayList<String> dataList = new ArrayList<>();
        while ((str = br.readLine()) != null) {
            String data = str.split("-")[0] + "-" + str.split("-")[1];
            dataList.add(data);
        }
        br.close();

        int boyCount = 0, girlCount = 0;
        double result = 0;
        for (int i = 0; i < 1000000; i++) {
            Student s1 = callRoll(dataList);
            if (s1.sex.equals("男")) {
                boyCount++;
            } else {
                girlCount++;
            }
        }
        System.out.println(boyCount + " " + girlCount);
        result = boyCount * 1.0 / (girlCount);
        System.out.println(result);
    }

    private static class Student {
        String name;
        String sex;

        public Student() {
        }

        public Student(String name, String sex) {
            this.name = name;
            this.sex = sex;
        }

        /**
         * 获取
         *
         * @return name
         */
        public String getName() {
            return name;
        }

        /**
         * 设置
         *
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取
         *
         * @return sex
         */
        public String getSex() {
            return sex;
        }

        /**
         * 设置
         *
         * @param sex
         */
        public void setSex(String sex) {
            this.sex = sex;
        }

        public String toString() {
            return "student{name = " + name + ", sex = " + sex + "}";
        }
    }

    private static Student callRoll(ArrayList<String> dataList) throws IOException {
        Collections.shuffle(dataList);
        ArrayList<Student> nameList = new ArrayList<>();
        int boyCount = 0, girlCount = 0;
        /*
        10 random people out of 50 to form a random array.
        boy:girl == 7:3
        * */
        for (String data : dataList) {
            if (data.split("-")[1].equals("男") && boyCount < 7) {
                nameList.add(new Student(data.split("-")[0], "男"));
                boyCount++;
            } else if (data.split("-")[1].equals("女") && girlCount < 3) {
                nameList.add(new Student(data.split("-")[0], "女"));
                girlCount++;
            } else if (data.length() == 10) {
                break;
            }
        }
        Collections.shuffle(nameList);
//        System.out.println(nameList);
        return nameList.get(0);
    }
}
