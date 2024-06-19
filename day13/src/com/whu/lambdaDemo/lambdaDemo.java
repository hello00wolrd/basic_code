package com.whu.lambdaDemo;

public class lambdaDemo {
    //        lambda
//Lambda表达式可以用来简化匿名内部类的书写
//
//Lambda表达式只能简化函数式接口的匿名内部类的写法
//
//函数式接口： 有且只有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解
    public static void main(String[] args) {
/*        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("i am swimming");
            }
        });*/

        method(()-> System.out.println("i am swimming!"));
    }

    public static void method(Swim s) {
        s.swimming();
    }
}

interface Swim {
    public abstract void swimming();
}