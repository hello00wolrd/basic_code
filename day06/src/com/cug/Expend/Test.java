package com.cug.Expend;
//子类只能访问父类中非私有的成员和方法
/*
* 子类可以继承父类中的什么内容?
* 构造方法都不可以继承
* 成员变量 非私有的成员变量和私有的成员变量都可以继承
* 成员方法 可以继承虚方法表否则不可以
* */
public class Test {
    public static void main(String[] args) {
        DollCat dc = new DollCat();
        dc.catchMouse();
        dc.eat();
        dc.drink();
    }
}
