package com.cug.homework;

/**
 * 将数据arr中的数据从索引from开始到to结束，左闭右开的元素复制到新数组中
 */
public class CopyArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] copyArr = copyOfRange(arr, 3, 7);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];//数组建立在堆中
//        System.arraycopy(arr, from, newArr, 0, to - from);
        for (int i = from; i < to; i++) {
            newArr[i - from] = arr[i];
        }
        return newArr;
    }
}
