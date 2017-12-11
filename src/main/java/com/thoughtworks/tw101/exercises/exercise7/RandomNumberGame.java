package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;

public class RandomNumberGame {
    private RandomNumberGuessChecker guessChecker;
    private Scanner reader;

    public RandomNumberGame(RandomNumberGuessChecker guessChecker) {
        reader = new Scanner(System.in);
        this.guessChecker = guessChecker;

        System.out.println("What's your name?");
        String name = reader.next();
        System.out.println("OK. Welcome " + name);
    }

    protected void endGame() {
        System.out.println("You guessed my number! You win.");
    }

    protected String playRound() {
        System.out.println("Guess an integer between 1 and 100.");
        String guess = reader.next();
        guessChecker.checkGuess(guess);
        return guess;
    }

    public void playGame() {
        guessChecker.resetChecker();
        while (!guessChecker.isGameOver()) {
            playRound();
        }
        endGame();
    }

    public void stopPlayingGames() {
        reader.close();
    }
}