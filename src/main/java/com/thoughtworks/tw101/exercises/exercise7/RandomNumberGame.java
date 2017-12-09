package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;

public class RandomNumberGame {
    protected static Scanner reader = new Scanner(System.in);
    private int randomNum;
    private boolean gameOver;

    public RandomNumberGame() {
        RandomNumberGenerator gen = new RandomNumberGenerator();
        randomNum = gen.getRandomNum();
        gameOver = false;
    }

    protected String endGame() {
        gameOver = true;
        return "Nice! Game over.";
    }

    private String checkNum(int n) {
        if (n == randomNum) {
            return endGame();
        } else if (n < randomNum)
            return "Too low";
        else
            return "Too high";
    }

    protected void parseGuess(String guess) {
        int guessInt = Integer.parseInt(guess);
        System.out.println(checkNum(guessInt));
    }

    public void play() {
        while (gameOver == false) {
            System.out.println("Guess an integer between 1 and 100.");
            String guess = reader.next();
            parseGuess(guess);
        }
    }

    public static void closeReader() {
        reader.close();
    }
}