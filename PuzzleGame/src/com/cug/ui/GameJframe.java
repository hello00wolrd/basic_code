package com.cug.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJframe extends JFrame implements KeyListener, ActionListener {
    //    创建二维数组
    int[][] data = new int[3][3];
    //    记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;
    int[][] win = new int[][]{
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 0}
    };
    int step = 0;
    //        创建选项的条目
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeGame = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

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

    //初始化游戏数据
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
                }
                this.data[i][j] = tempArray[index];
                index++;
            }
        }
    }

    //初始化图片
    private void initImage() {
//        清空原本已经出现的所有图片
        this.getContentPane().removeAll();
//      先加载的图片在上方,后加载的图片塞在下面
        if (victory()) {
            ImageIcon victoryIcon = new ImageIcon("PuzzleGame\\image\\victory.png");
            JLabel victoryShow = new JLabel(victoryIcon);
            victoryShow.setBounds(200, 200, victoryIcon.getIconWidth(), victoryIcon.getIconHeight());
            this.getContentPane().add(victoryShow);
        }
        JLabel stepCount = new JLabel("步数" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

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

    //初始化菜单栏
    private void initJM() {
        //        初始化菜单
//        创建菜单对象
        JMenuBar jmb = new JMenuBar();

//        创建菜单上两个选项的对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于作者");


//        将每个选项中的条目添加到选项当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeGame);

        aboutJMenu.add(accountItem);

//        给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeGame.addActionListener(this);
        accountItem.addActionListener(this);
//      把菜单里面的选项添加到菜单中
        jmb.add(functionJMenu);
        jmb.add(aboutJMenu);
//        给整个界面设置菜单
        this.setJMenuBar(jmb);

    }

    //初始化界面
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

    //    当键盘按下不松的时候调用此类方法
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
//        按下去"a"触发
        if (code == 65) {
//    把界面中所有图片删除
            this.getContentPane().removeAll();
//            加载一张完整的图片
            ImageIcon allIcon = new ImageIcon("E:\\java_code\\basic_code\\PuzzleGame\\image\\all.jpeg");
            JLabel all = new JLabel(allIcon);
            all.setBounds(0, 0, allIcon.getIconWidth(), allIcon.getIconHeight());
            this.getContentPane().add(all);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        先判断游戏是否胜利,如果胜利,直接结束,不可以移动方块
        if (victory()) {
            return;
        }

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
//            每移动一次都计数加一
            step++;
            initImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            if (x == 2) return;
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
//            每移动一次都计数加一
            step++;
            initImage();
        } else if (code == 39) {
            System.out.println("向右移动");
            if (y == 0) return;
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
//            每移动一次都计数加一
            step++;
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            if (x == 0) return;
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
//            每移动一次都计数加一
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
//            当按下"w"的时候实现作弊,直接通关
            data = new int[][]{
                    {1, 4, 7},
                    {2, 5, 8},
                    {3, 6, 0}
            };
            initImage();
        }
    }

    //    判断data数组与win数组中是否相同,如果全部相同,返回true
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (win[i][j] != data[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//获取当前被点击的对象
        Object source = e.getSource();
//        判断
        if (source == replayItem) {
//            System.out.println("重新游戏");
            step = 0;
            initData();
            initImage();
        } else if (source == reLoginItem) {
//            System.out.println("重新登陆");
//            关闭当前游戏界面
            this.setVisible(false);
//            打开登录界面
            new LoginJframe();
        } else if (source == closeGame) {
//            System.out.println("关闭游戏");
            System.exit(0);
        } else if (source == accountItem) {
//            System.out.println("公众号");
//            弹窗对象
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel("https://github.com/hello00wolrd/basic_code");
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
        }
    }
}
