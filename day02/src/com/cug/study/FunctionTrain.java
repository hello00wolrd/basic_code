package com.cug.study;

public class FunctionTrain {
//  方法和方法之间是平级关系，不可以相互嵌套定义
    public static void main(String[] args) {
        test(1, 3);

    }

    public static int test2(int a, int b) {
        System.out.println("这是方法二");
        return (a + b);
    }

    public static void test(int a, int b) {
//      掌握java中的方法简单定义和调用的格式
//      java中不必要把方法写到main方法前
        System.out.println("这是一个方法");
        System.out.println(test2(a, b));
    }

}
