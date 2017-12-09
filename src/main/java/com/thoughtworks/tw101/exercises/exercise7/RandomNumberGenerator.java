package com.thoughtworks.tw101.exercises.exercise7;

public class RandomNumberGenerator {
    private int randomNum;

    public RandomNumberGenerator() {
        randomNum = (int) (Math.random() * 100);
    }
    public int getRandomNum() { return randomNum; }

}
