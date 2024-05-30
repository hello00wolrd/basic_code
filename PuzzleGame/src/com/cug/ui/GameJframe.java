package com.cug.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJframe extends JFrame implements KeyListener {
    //    创建二维数组
    int[][] data = new int[3][3];
    //    记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    //    游戏主界面
    public GameJframe() {
//初始化界面
        init();
//初始化菜单
        initJM();
//        初始化数据
        initData();
//        初始化图片
        initImage();

//        显示界面
        this.setVisible(true);
    }

    private void initData() {
        //        定义一个一维数组0-8
        int[] tempArray = new int[9];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = i;
        }
//        打乱数组中数组的顺序
        Random r = new Random();
        for (int i = 0; i < tempArray.length; i++) {
//            获取随机序列
            int index = r.nextInt(tempArray.length);
//            将每个数据与随机索引上的数据进行交换
            int temp = tempArray[index];
            tempArray[index] = tempArray[i];
            tempArray[i] = temp;
        }
//        创建个二维数组

        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tempArray[index] == 0) {
//                    记录空白块位置
                    this.x = i;
                    this.y = j;
                } else {
                    this.data[i][j] = tempArray[index];
                }
                index++;
            }
        }
    }

    private void initImage() {
//        清空原本已经出现的所有图片
        this.getContentPane().removeAll();
//      先加载的图片在上方,后加载的图片塞在下面

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
//                正确拼图为1-8顺序加载
                ImageIcon icon = new ImageIcon("PuzzleGame\\image\\imageonline\\" + data[i][j] + ".jpeg");
//                创建一个JLabel的对象(管理容器)
                JLabel jlabel = new JLabel(icon);
//                指定位置
                jlabel.setBounds(icon.getIconWidth() * j, icon.getIconHeight() * i, icon.getIconWidth(), icon.getIconHeight());
//                添加边框
                jlabel.setBorder(new BevelBorder(BevelBorder.RAISED));
//                把管理容器添加到页面中
                this.getContentPane().add(jlabel);
            }
        }
//        刷新一下界面
        this.getContentPane().repaint();
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
        this.setSize(676, 911);
//        设置标题
        this.setTitle("拼图游戏");
//        设置界面置顶
        this.setAlwaysOnTop(true);
//        设置界面居中
        this.setLocationRelativeTo(null);
//        设置关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        取消默认居中放置,只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
//        给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
//对上、下、左、右进行判断
//        左：37 上：38 右：39 下：40
        int code = e.getKeyCode();
//        System.out.println(code);
        if (code == 37) {
            System.out.println("向左移动");
            if (y == 2) return;
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
        } else if (code == 38) {
            System.out.println("向上移动");
            if (x == 2) return;
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
        } else if (code == 39) {
            System.out.println("向右移动");
            if (y == 0) return;
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
        } else if (code == 40) {
            System.out.println("向下移动");
            if (x == 0) return;
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
        }
        initImage();
    }
}
