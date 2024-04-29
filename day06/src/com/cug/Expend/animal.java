package com.cug.Expend;

//当类与类存在共性的内容,并且满足子类是父类的一种,就可以考虑继承,来优化代码
//子类可以继承父类的属性和行为
//java只支持单继承,不支持多继承,但是支持多层继承
//每一个类都直接或者间接的继承于object类
public class animal {
    public void eat() {
        System.out.println("eat");
    }

    public void drink() {
        System.out.println("drink");
    }

}
