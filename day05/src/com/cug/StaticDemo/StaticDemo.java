package com.cug.StaticDemo;

//静态修饰符
public class StaticDemo {
    private int age;
    private String name;
    private String gender;
    public static String teacherName;

    public StaticDemo() {
    }

    public StaticDemo(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "StaticDemo{age = " + age + ", name = " + name + ", gender = " + gender + "teacherName = " + teacherName + "}";
    }
//    public static String teacherName;

}
