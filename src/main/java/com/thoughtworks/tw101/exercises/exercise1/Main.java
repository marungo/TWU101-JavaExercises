package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {

    private static void printOddNumbersAndTheirSum(int n) {
        for (int i = 0; i <= n; i++) {
            if (isOdd(i)) { System.out.print(i + " "); }
            if (isTen(i)) { System.out.println(); }
        }
        printSumOddNumbers(n);
    }

    private static boolean isOdd(int n) { return (n%2) == 1; }
    private static boolean isTen(int n) { return (n%10) == 0; }
    private static void printSumOddNumbers(int n) {
        System.out.println("sum: " + Math.pow(((n+1)/2), 2));
    }

    public static void main(String[] args) {
        printOddNumbersAndTheirSum(100);
    }
}
