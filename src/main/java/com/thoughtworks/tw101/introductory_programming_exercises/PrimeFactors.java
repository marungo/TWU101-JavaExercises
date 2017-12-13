package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        System.out.println(primeFactors.toString());
    }

    private static boolean isPrime(int n) {
        return (findFactors(n).size() == 0);
    }

    private static List<Integer> findFactors(int n) {
        List<Integer> potentialFactors = IntStream.rangeClosed(2, Math.abs(n)-1)
                .boxed().collect(Collectors.toList());

        List<Integer> factors = potentialFactors.stream()
                .filter(f -> (n%f == 0))
                .collect(Collectors.toList());

        return factors;
    }

    private static List<Integer> generate(int n) {
        List<Integer> primeFactors = findFactors(n).stream()
                .filter(factor -> isPrime(factor))
                .collect(Collectors.toList());
        return primeFactors;
    }

}
