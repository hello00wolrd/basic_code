package com.cug.mathDemo;

public class mathDemo2 {
    public static void main(String[] args) {
        System.out.println(isPrime(12314231));
    }


    public static Boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}