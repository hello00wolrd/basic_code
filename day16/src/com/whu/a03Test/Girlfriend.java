package com.whu.a03Test;

public class Girlfriend {
    int age;
    String name;

    private Girlfriend(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Girlfriend() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 40) {
            this.age = age;
        } else {
            throw new NameFormatException(age + " 格式有误,应该在18-40内");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3 && name.length() <= 10) {
            this.name = name;
        } else {
            throw new RuntimeException(name + " 格式有误,应该把字数控制在3-10内");
        }
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
