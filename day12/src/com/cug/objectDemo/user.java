package com.cug.objectDemo;

import java.util.StringJoiner;
//Cloneable
//如果一个接口里面没有抽象方法
//表示当前的接口是一个标记性接口
//现在Cloneable表示一旦实现，那么当前的类的对象就可以被克隆
//如果没有实现，当前类就不可以被克隆

public class user implements Cloneable {
    private int id;
    private String username;
    private String password;
    private String path;
    int[] data;//游戏进度

    public user() {
    }

    @Override
    public String toString() {
        return "用户id: " + id + "用户名: " + username + "密码: " + password + "游戏图片: " + path + "游戏进度: " + arrayToString();
    }

    private String arrayToString() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(String.valueOf(data[i]));
        }
        return sj.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public user(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        相当于父类中的clone方法
//        相当于让Java帮我们克隆一个对象,并且把克隆之后的对象返回出去。
//        return super.clone();

//        把被克隆的数组获取出来
        int[] data = this.data;
//        创建新的数组
        int[] newData = new int[data.length];
//        拷贝数据
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
//        调用父类的克隆对象
        user u = (user) super.clone();
        u.data = newData;
        return u;
    }
}
