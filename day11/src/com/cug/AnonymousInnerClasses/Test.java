package com.cug.AnonymousInnerClasses;

/*匿名内部类
new 类名或者接口名(){
重写方法};
* */
public class Test {
    public static void main(String[] args) {
//        实现关系
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写的游泳方法");
            }
        }.swim();
//        创建完匿名内部类后可以直接调用内部方法
//        继承关系
        method(new Animal() {
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        });

    }

    public static void method(Animal a) {
        a.eat();
    }
}
