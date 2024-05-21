package com.cug.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
//        游戏界面
        JFrame gameJframe = new JFrame();
        gameJframe.setSize(603, 680);
//        默认界面隐藏
        gameJframe.setVisible(true);

//        登录界面
        JFrame loginjframe = new JFrame();
        loginjframe.setSize(488, 430);
        loginjframe.setVisible(true);

//        注册界面
        JFrame registerJframe = new JFrame();
        registerJframe.setSize(488, 433);
        registerJframe.setVisible(true);
    }
}
