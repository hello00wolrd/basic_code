package com.cug.Expend;
/*重写方法的名称和形参列表必须与父类完全一致
*子类重写父类的时候,访问权限必须大于等于父类
*子类重写父类的时候,返回值类型子类必须小于等于父类
* 建议:重写的方法尽量与父类保持一致
* 只有被添加到虚方法表中方法才可以重写
* */
public class Test3 {
    public static void main(String[] args) {
        OverseaPerson op = new OverseaPerson();
        op.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("eating rice");
    }

    public void drink() {
        System.out.println("drink boiling water");
    }
}

class OverseaPerson extends Person {
    public void lunch() {
        this.eat();
        this.drink();

        super.eat();
        super.drink();

        eat();
        drink();
    }

    @Override
    public void eat() {
        System.out.println("eating pasta");
    }

    @Override
    public void drink() {
        System.out.println("drink cold water");
    }
}
