package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;

public class OneClassRandomNumberGame {
    private static Scanner reader = new Scanner(System.in);
    private int randomNum;
    private boolean gameOver;

    OneClassRandomNumberGame() {
        randomNum = generateRandomNum();
        gameOver = false;
    }

    private int generateRandomNum() {
        return (int) (Math.random() * 100);
    }

    private String endGame() {
        return "You guessed my number! You win.";
    }

    private String checkNum(int n) {
        if (n == randomNum) {
            gameOver = true;
            return endGame();
        } else if (n < randomNum)
            return "Too low";
        else
            return "Too high";
    }

    private void parseGuess(String guess) {
        int guessInt = Integer.parseInt(guess);
        System.out.println(checkNum(guessInt));
    }

    public void play() {
        while (!gameOver) {
            System.out.println("Guess an integer between 1 and 100.");
            String guess = reader.next();
            parseGuess(guess);
        }
    }

    public static void closeReader() {
        reader.close();
    }
}