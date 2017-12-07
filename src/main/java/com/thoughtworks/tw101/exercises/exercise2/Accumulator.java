package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int count;

    public Accumulator() {
        this.count = 0;
    }

    public void increment() {
        count++;
    }

    public int total() {
        System.out.println(count);
        return count;
    }

}
