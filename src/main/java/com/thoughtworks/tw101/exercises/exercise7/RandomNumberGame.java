package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;

public class RandomNumberGame {
    private static Scanner reader = new Scanner(System.in);
    private int randomNum;
    private boolean gameOver;

    public RandomNumberGame() {
        RandomNumberGenerator gen = new RandomNumberGenerator();
        randomNum = gen.getRandomNum();
        gameOver = false;
    }

    private String checkNum(int n) {
        if (n == randomNum) {
            gameOver = true;
            return "Correct! Game Over";
        } else if (n < randomNum)
            return "Too low";
        else
            return "Too high";
    }

    private void playRound(Scanner reader) {
        System.out.println("Guess an integer between 1 and 100.");
        int n = Integer.parseInt(reader.next());
        System.out.println(checkNum(n));
    }

    public void play() {
        while (gameOver == false) {
            playRound(reader);
        }
    }

}