package com.cug.StringDemo;

//this可以区分成员变量和局部变量
//被private修饰的成员只能在本类内访问
//如果我们没有写任何的构造方法那么虚拟机会给我们自动构造空参构造
/*
 * 构造方法方法名和类名相同,大小写也一致
 * 没有返回值类型,连void都没有
 * 没有具体的返回值,不可以使用return
 * */
public class Girlfriend {
    private String name;
    private int age;
    private String gender;

    public Girlfriend() {
        this.name = "noName";
        this.age = 16;
        this.gender = "woman";
        System.out.println("已经初始化了");
    }

    public Girlfriend(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }//带全部参数的构造方法

    public void setAge(int age) {
        if (age >= 16 && age <= 30) {
            this.age = age;//前面没有this所以触发就近原则
        } else {
            System.out.println("请输入合适的年龄");
        }
    }

    public void setGender(String g) {
        if (g.equalsIgnoreCase("woman")) {
            gender = "woman";
        } else {
            System.out.println("请输入合适的性别");
        }
    }

    public void setNamer(String g) {
        name = g;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
