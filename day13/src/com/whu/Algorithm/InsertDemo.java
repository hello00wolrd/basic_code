package com.whu.Algorithm;

public class InsertDemo {
    public static void main(String[] args) {
        int[] arr = ToolClass.getArrSourceClone();
        int startIndex = -1;
//        找到无序的数组从哪里开始
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
//         遍历
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        ToolClass.printArr(arr);
        System.out.println("\n"+ToolClass.isSorted(arr));
    }
}
