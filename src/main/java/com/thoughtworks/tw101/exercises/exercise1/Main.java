package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    private static void printOddNumbersTo100AndTheirSum() {
        int[] odds = IntStream.iterate(1, n -> n + 2).limit(50).toArray();
        System.out.println(Arrays.toString(odds));
        System.out.println((int) Math.pow(((100+1)/2),2));
    }

    public static void main(String[] args) {
        printOddNumbersTo100AndTheirSum();
    }
}
