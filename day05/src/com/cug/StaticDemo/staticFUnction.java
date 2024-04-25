package com.cug.StaticDemo;

/*静态方法:多用在测试类(一般含有main,是程序的入口)和工具类(帮助做一些事情)中
javaBean中很少会用
调用方式:
类名调用
对象名调用
* */
/*工具类:
私有化构造方法
方法定义为静态
* */
public class staticFUnction {
    public static void main(String[] args) {
        int[] arr = {1, 28768, 399, 4000, 5};
        System.out.println(ArrayUtil.arrPrint(arr));
        System.out.println(ArrayUtil.getAverage(arr));
    }
}
