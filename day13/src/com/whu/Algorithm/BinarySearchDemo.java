package com.whu.Algorithm;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 100, 102, 145, 299};
        System.out.println(binarySearch(arr,102));
    }

    private static int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;

        while (true) {
            if (min > max) {
                return -1;
            }
            int mid = (min + max) / 2;
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
    }
}
