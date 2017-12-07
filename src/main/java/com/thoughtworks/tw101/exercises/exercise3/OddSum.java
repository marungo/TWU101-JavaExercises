package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int sumAllOddsToEnd = findSumAllOddsToN(end);
        int sumAllOddsToStart = findSumAllOddsToN(start);
        return sumAllOddsToEnd - sumAllOddsToStart;
    }

    private int findSumAllOddsToN(int n) {
        return (int) Math.pow(((n+1)/2),2);
    }
}