package com.cug.TestDemo;

//静态代码块格式static{}
//需要通过static关键字修饰,随着类的加载而加载,并且自动触发,只执行一次
public class StaticCodeBlock {
    private String name;
    private int age;

    static {
        System.out.println("静态代码块被执行了");
    }

    public StaticCodeBlock() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StaticCodeBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
