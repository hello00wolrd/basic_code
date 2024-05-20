package com.cug.InterFace;
/*类和类的关系
继承关系,只能单继承,不能多继承,但是可以多层继承
类和接口的关系,实现关系,也可以多实现,还可以在继承一个类的同时实现多个接口
接口和接口的关系
继承关系,可以单继承,也可以多继承
* */
public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青", 1);
        f.eat();
        f.swim();

        Rabbit r = new Rabbit("小白兔", 2);
        r.eat();
    }
}
