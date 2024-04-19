package com.cug.homework;

//找质数,判断2-10000中有多少个质数并且输出
public class FindPrime {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i)) {
                sum++;
                if (i != 10000) {
                    System.out.print(i + ",");
                } else {
                    System.out.print(i);
                }
            } else continue;
        }
        System.out.println("\n" + sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;//非质数
        int sqr = (int) Math.sqrt(n);
        for (int i = 2; i <= sqr; i++) {
            if (n % i == 0) return false;
        }
        return true;//是质数
    }
}
