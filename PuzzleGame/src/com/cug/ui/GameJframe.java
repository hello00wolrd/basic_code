package com.cug.ui;

import javax.swing.*;

public class GameJframe extends JFrame {
    //    游戏主界面
    public GameJframe() {
//初始化界面
        init();

//初始化菜单
        initJM();


//        显示界面
        this.setVisible(true);
    }

    private void initJM() {
        //        初始化菜单
//        创建菜单对象
        JMenuBar jmb = new JMenuBar();

//        创建菜单上两个选项的对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于作者");
//        创建选项的条目
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeGame = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

//        将每个选项中的条目添加到选项当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeGame);

        aboutJMenu.add(accountItem);
//      把菜单里面的选项添加到菜单中
        jmb.add(functionJMenu);
        jmb.add(aboutJMenu);
//        给整个界面设置菜单
        this.setJMenuBar(jmb);
    }

    private void init() {
        this.setSize(603, 680);
//        设置标题
        this.setTitle("拼图游戏");
//        设置界面置顶
        this.setAlwaysOnTop(true);
//        设置界面居中
        this.setLocationRelativeTo(null);
//        设置关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
