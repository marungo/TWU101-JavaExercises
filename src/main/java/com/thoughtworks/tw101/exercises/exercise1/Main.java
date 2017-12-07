package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {

    private static void printOddNumbersAndTheirSum(int n) {
        int i;
        for (i = 0; i <= n; i++) {
            if (i%2 == 1) {
                System.out.print(i + " ");

            }
            if (i%10 == 0) {
                System.out.println();
            }
        }
        printSumOddNumbers(n);
    }

    private static void printSumOddNumbers(int n) {
        System.out.println("sum: " + Math.pow(((n+1)/2), 2));
    }

    public static void main(String[] args) {
        printOddNumbersAndTheirSum(100);
    }
}
