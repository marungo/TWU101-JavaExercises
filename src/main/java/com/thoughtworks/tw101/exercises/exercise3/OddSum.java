package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int sumAllOddsThroughEnd = findSumAllOddsThroughN(end);
        int sumAllOddsToStart = findSumAllOddsThroughN(start-1);
        return sumAllOddsThroughEnd - sumAllOddsToStart;
    }

    private int findSumAllOddsThroughN(int n) {
        return (int) Math.pow(((n+1)/2),2);
    }

}