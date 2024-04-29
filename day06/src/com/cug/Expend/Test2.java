package com.cug.Expend;

//方法的重写,当父类中的方法不能满足子类的需求的时候,需要进行方法的重写
//@Override注解,
//1.@Override是放在重写后的方法上,校验子类重写时的语法是否正确
//2.加上注解后如果有红色的波浪线的话,表示语法错误
//3.建议重写方法都加上@Override注解,代码安全,优雅!
public class Test2 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.ziShow();
    }
}

class Fu {
    String name = "Fu";
}

class Zi extends Fu {
    String name = "Zi";

    public void ziShow() {
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
