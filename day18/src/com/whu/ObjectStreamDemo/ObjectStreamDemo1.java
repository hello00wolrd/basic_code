package com.whu.ObjectStreamDemo;

import java.io.*;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        序列化流
        Student st = new Student("zhangSan", 18);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\ObjectStreamDemo\\student.ser"));
        oos.writeObject(st);
        oos.close();
//        反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\ObjectStreamDemo\\student.ser"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
