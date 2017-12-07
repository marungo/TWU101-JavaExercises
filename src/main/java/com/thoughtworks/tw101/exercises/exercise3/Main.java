package com.thoughtworks.tw101.exercises.exercise3;

public class Main {

//    Exercise #3: Create a function 'of' in the class OddSum that returns the sum of all odd integers between a starting
//    and ending integer value.

    public static void main(String[] args) {
        OddSum oddSum = new OddSum();

        Integer sum1to100 = oddSum.of(1, 100);
        Integer sum5to20 = oddSum.of(5,20);
        Integer sum4to20 = oddSum.of(4,20);
        Integer sum3to20 = oddSum.of(3,20);

        System.out.println(sum1to100);
        System.out.println(sum5to20);
        System.out.println(sum4to20);
        System.out.println(sum3to20);

    }
}
