package com.cug.homework;
//找一个数的平方根的向下取整
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
//        double squareRoot = Math.sqrt(number);
        double squareRoot = 0.0;
        for (int i = 0;; i++) {
            if (i * i > number) {
                squareRoot = --i;
                break;
            }
        }
        System.out.println(squareRoot);
    }
}
