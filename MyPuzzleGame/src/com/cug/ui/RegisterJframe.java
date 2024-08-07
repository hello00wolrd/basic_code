package com.cug.ui;

import javax.swing.*;

public class RegisterJframe extends JFrame {
    //    注册主界面
    public RegisterJframe() {
        this.setSize(488, 433);
        //        设置标题
        this.setTitle("拼图游戏注册界面");
//        设置界面置顶
        this.setAlwaysOnTop(true);
//        设置界面居中
        this.setLocationRelativeTo(null);
//        设置关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
