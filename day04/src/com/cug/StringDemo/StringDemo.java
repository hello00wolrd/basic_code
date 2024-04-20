package com.cug.StringDemo;
//方便拼接字符串，字符串反转
public class StringDemo {
    public static void main(String[] args) {
        int[] arr = new int[0];
        String str1 = arrToString(arr);
        System.out.println(str1);
    }

    public static String arrToString(int[] arr) {
        String result = "[";
        if (arr == null) {
            return null;
        } else if (arr.length == 0) {
            return "[]";
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    result += arr[i];
                    break;
                }
                result = result + arr[i] + ",";
            }
        }
        return result + "]";
    }
}
