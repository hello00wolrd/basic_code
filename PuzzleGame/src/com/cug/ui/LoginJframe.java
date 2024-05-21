package com.cug.ui;

import javax.swing.*;

public class LoginJframe extends JFrame {
    //    登录主界面
    public LoginJframe() {
//        在创建登录界面的同时,进行初始设置
//        列如宽高,直接展示与否
        this.setSize(488, 430);
        //        设置标题
        this.setTitle("拼图游戏登录界面");
//        设置界面置顶
        this.setAlwaysOnTop(true);
//        设置界面居中
        this.setLocationRelativeTo(null);
//        设置关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
