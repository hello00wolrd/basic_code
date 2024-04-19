package com.cug.demo2;

public class ArithmeticOperatorsDemo {
    //主入口
    public static void main(String[] args) {
        //+
        System.out.println(2 + 3);//5
        //%
        System.out.println(10 % 4);
        //小数运算有可能不精确
        System.out.println(1.1 + 1.01);//2.1100000000000003
        System.out.println(1.1 + 1.1);//2.2
        //整数参与计算那么只能得到整数
        System.out.println(10 / 3);//3
        byte a = 10;
        byte b = 20;
        //byte char short 类型在运算的时候会先将a和b提升为int型
        int c = a + b;
        System.out.println(c);
        String str0 = "123";
        String str1 = "456";
        System.out.println(str0 + str1);
        System.out.println(1 + 99 + str0 + str1);
        System.out.println((char) ('a' + 3));
        //逻辑运算符 &逻辑与 |逻辑或 ^逻辑异或 !逻辑非
        System.out.println(true & false);//false
        System.out.println(true ^ true);//false
        //短路与=>&& 短路或=>||,和&和|没区别但是有短路的作用
        //也可以使用三元运算符,和c/c++一样相同
        if (true) {
            //if语句与cpp相同
            System.out.println("true");
        }
        //编码规范,如果对布尔类型的变量进行判断不要用==号,可以直接把变量写在小括号内
//        Scanner sc = new Scanner(System.in);
//        int flag_s = sc.nextInt();
//        switch (flag_s + 1) {
//            case 2:
//                System.out.println("1");
//                break;
//            default:
//                System.out.println("default");
//        }
//        switch 语句和cpp语法上没有区别,switch表达式的取值可以是byte,short,char,int,JDK5后面可以是枚举,JDK7后面可以是String
//        case给出的值只能是字面值,不能是变量
        int number = 23;
        switch (number) {
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            default -> System.out.println("default");
        }
//        Scanner sc = new Scanner(System.in);
//        int week= sc.nextInt();
//        switch (week) {
//            case 1,2,3,4,5 -> {System.out.println("工作日");}
//            case 6,7-> {System.out.println("休息日");}
//            default -> System.out.println("错误输入");
//        }
//        for循环和cpp一样
    }
}
