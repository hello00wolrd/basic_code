package com.cug.homework;

public class TwoDimensionalArrayExercises {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };//推荐写法为这样子写二维数组，定义静态数组
        int[][] arr2 = new int[3][4];//定义动态数组,可以理解为二维数组中的每个数组中都存着一个一维数组的地址
        System.out.println(arr2[2].length);
        System.out.println(arr1[2][1]);
    }

}
