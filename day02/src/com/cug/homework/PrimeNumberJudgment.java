package com.cug.homework;
//判断是否是质数
import java.util.Scanner;

public class PrimeNumberJudgment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number <= 1) {
                isPrime = false;
                break;
            }
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("是质数");
        } else {
            System.out.println("非质数");
        }
    }
}
