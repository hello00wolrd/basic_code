package com.cug.Expend;
//子类只能访问父类中非私有的成员和方法
public class Test {
    public static void main(String[] args) {
        DollCat dc = new DollCat();
        dc.catchMouse();
        dc.eat();
        dc.drink();
    }
}
