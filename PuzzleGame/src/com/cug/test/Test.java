package com.cug.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        定义一个一维数组
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
        int[][] data = new int[3][3];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = tempArray[index];
                index++;
            }
        }
    }
}
