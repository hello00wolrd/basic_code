package com.whu.Training;

public class MyParseInt {
    public static void main(String[] args) {
//        定义一个字符串
        String str1 = "1234567";
        System.out.println(myParseInt(str1)+1);
    }

    private static int myParseInt(String str) {
//        习惯上来说会先对异常的数据进行过滤
        if (!str.matches("[0-9][\\d]{0,8}")) {
//            数据错误
            System.out.println("数据错误");
            return -1;
        } else {
//             数据正确
            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                number = number * 10 + c;
            }
            return number;
        }
    }
}
