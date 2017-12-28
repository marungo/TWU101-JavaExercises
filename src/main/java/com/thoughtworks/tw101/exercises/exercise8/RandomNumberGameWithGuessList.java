package com.thoughtworks.tw101.exercises.exercise8;

import com.thoughtworks.tw101.exercises.exercise7.RandomNumberGame;
import com.thoughtworks.tw101.exercises.exercise7.RandomNumberGuessChecker;
import java.util.ArrayList;

public class RandomNumberGameWithGuessList extends RandomNumberGame {
    private ArrayList<String> guesses;

    RandomNumberGameWithGuessList(RandomNumberGuessChecker guessChecker) {
        super(guessChecker);
        guesses = new ArrayList<>();
    }

    @Override
    protected void endGame() {
        super.endGame();
        System.out.println("These were your guesses from the game: " + guesses);
    }

    protected String playRound() {
        String guess = super.playRound();
        guesses.add(guess);
        return guess;
    }
}