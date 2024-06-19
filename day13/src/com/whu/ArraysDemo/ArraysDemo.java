package com.whu.ArraysDemo;

import com.whu.Algorithm.ToolClass;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
//        Arrays.toString()
        int[] arr = ToolClass.getArrSourceClone();
        int[] arr2 = ToolClass.getArrSortClone();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
//        Arrays.BinarySearch()
//        二分查找的前提是有序的
//        如果元素不存在,那么返回的是 -插入点-1
        System.out.println(Arrays.binarySearch(arr2,151));
//        copyOf:拷贝数组
//        如果新数组的长度大于老数组的长度那么,会补上默认初始值
        int [] arr3 = Arrays.copyOf(arr2,10);
        System.out.println(Arrays.toString(arr3));
//        copyOfRange:拷贝数组,(指定范围)
//        细节:包头不包尾,包左不包右
        int [] arr4 = Arrays.copyOfRange(arr2,0,9);
        System.out.println(Arrays.toString(arr4));
//        fill:填充数组
//        会覆盖原来的数组
        Arrays.fill(arr4,0);
        System.out.println(Arrays.toString(arr4));
//        sort:进行排序,底层使用的是快速排序
        Arrays.sort(arr);
        System.out.println(ToolClass.isSorted(arr));
    }
}
