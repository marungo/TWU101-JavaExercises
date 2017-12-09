package com.thoughtworks.tw101.exercises.exercise8;
import java.util.Scanner;
import java.util.ArrayList;

public class RandomNumberGame {
    private Scanner reader;
    private RandomNumberGenerator gen;
    private int randomNum;
    private boolean gameOver;
    private ArrayList<Integer> guesses;

    public RandomNumberGame() {
        reader = new Scanner(System.in);
        gen = new RandomNumberGenerator();
        randomNum = gen.getRandomNum();
        gameOver = false;
        guesses = new ArrayList<>();
    }

    private int ensureValidGuess(String guess) {
        try {
            return Integer.parseInt(guess);

        } catch (NumberFormatException e) {
            System.out.println("Not valid. Guess must be an integer. Make another guess:");
            return ensureValidGuess(reader.next());
        }
    }

    private String checkNumTooHighOrTooLow(int n) {
        guesses.add(n);
        if (n < randomNum)
            return "Too low";
        else
            return "Too high";
    }

    private String checkGuess(int n) {
        if (n == randomNum) {
            gameOver = true;
            return "Correct! These were your valid guesses:\n" + guesses.toString();
        } else {
            return checkNumTooHighOrTooLow(n);
        }
    }

    private void playRound(Scanner reader) {
        System.out.println("Guess an integer between 1 and 100.");
        int validGuess = ensureValidGuess(reader.next());
        System.out.println(checkGuess(validGuess));
    }

    public void play() {
        while (gameOver == false) {
            playRound(reader);
        }
    }

}