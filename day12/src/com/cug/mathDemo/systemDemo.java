package com.cug.mathDemo;

public class systemDemo {
    public static void main(String[] args) {
////        正常停止
//        System.exit(0);
////        异常停止
//        System.exit(1);
//        long l = System.currentTimeMillis();
////        输出从程序原点到现在过了多少毫秒
//        System.out.println(l);
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[10];
        System.arraycopy(arr1, 0, arr2, 4, 3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
