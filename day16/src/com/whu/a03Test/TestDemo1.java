package com.whu.a03Test;

import java.util.Scanner;

public class TestDemo1 {
    /*
    *
需求：
键盘录入自己心仪的女朋友姓名和年龄。
姓名的长度在3-10之间，
年龄的范围为18-40岁，
超出这个范围是异常数据不能赋值，需要重新录入，一直录到正确为止。
提示：
需要考虑用户在键盘录入时的所有情况。
比如：录入年龄时超出范围，录入年龄时录入了abc等情况
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        创建对象
        Girlfriend gf = new Girlfriend();
        while (true) {
            try {
                //        接收名字
                System.out.println("Input the name");
                String name = sc.nextLine();
                gf.setName(name);
                //        接收年龄
                System.out.println("Input the age");
                String StringAge = sc.nextLine();
                int age = Integer.parseInt(StringAge);
                gf.setAge(age);
                break;
            } catch (Exception e) {
                e.printStackTrace();
//                continue;
            }
        }
    }
}
