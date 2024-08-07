package com.cug.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoginJframe extends JFrame implements ActionListener {


    static ArrayList<User> list = new ArrayList<>();

    static {
        list.add(new User("admin", "123456"));
        list.add(new User("test", "987654"));
    }

    JButton loginButton = new JButton("Login");
    JButton registerButton = new JButton("Register");
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();

    //    登录主界面
    public LoginJframe() {
//        初始化界面
        initJFrame();
//        界面添加内容
        initView();
//

    }

    private static class User {
        String name;
        String password;

        public User() {
        }

        public User(String name, String password) {
            this.name = name;
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    private void initView() {
//        添加用户名文字
        JLabel usernameText = new JLabel("Username:");
        usernameText.setBounds(50, 100, 100, 20);
        this.getContentPane().add(usernameText);
//        添加用户名输入框

        usernameField.setBounds(120, 100, 100, 20);
        this.getContentPane().add(usernameField);
//        添加密码文字
        JLabel passwordText = new JLabel("Password:");
        passwordText.setBounds(50, 150, 100, 20);
        this.getContentPane().add(passwordText);
//        添加密码输入框

        passwordField.setBounds(120, 150, 100, 20);
        this.getContentPane().add(passwordField);
//        添加登录按钮

        loginButton.setBounds(50, 200, 100, 20);
        this.getContentPane().add(loginButton);
//          去除边框
//        loginButton.setBorderPainted(false);


//        添加注册按钮
        registerButton.setBounds(160, 200, 100, 20);
        this.getContentPane().add(registerButton);

        loginButton.addActionListener(this);
        registerButton.addActionListener(this);
    }

    private void initJFrame() {
        //        在创建登录界面的同时,进行初始设置
//        列如宽高,直接展示与否
        this.setSize(488, 430);
        //        设置标题
        this.setTitle("拼图游戏登录界面");
//        设置界面置顶
        this.setAlwaysOnTop(true);
//        设置界面居中
        this.setLocationRelativeTo(null);
//        取消默认居中
        this.setLayout(null);
//        设置关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == loginButton) {
            for (int i = 0; i < list.size(); i++) {
                String nameTemp = list.get(i).getName();
                String passwordTemp = list.get(i).getPassword();
                if (nameTemp.equals("admin") && passwordTemp.equals("123456")) {
//            弹窗对象
                    JDialog jDialog = new JDialog();
                    JLabel jLabel = new JLabel("登陆成功");
                    jLabel.setBounds(0, 0, 100, 200);
                    jDialog.getContentPane().add(jLabel);
//            给弹框设置大小
                    jDialog.setSize(300, 100);
//            弹框置顶
                    jDialog.setAlwaysOnTop(true);
//            弹框居中
                    jDialog.setLocationRelativeTo(null);
//            弹框不关闭不能操作以后的界面
                    jDialog.setModal(true);
//            显示弹框
                    jDialog.setVisible(true);
                    break;
                }
            }
        }
    }
}
