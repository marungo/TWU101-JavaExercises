package com.thoughtworks.tw101.exercises.exercise8;
import com.thoughtworks.tw101.exercises.exercise7.RandomNumberGame;
import java.util.ArrayList;

public class RandomNumberGameWithGuessList extends RandomNumberGame {
    private ArrayList<Integer> guesses;

    public RandomNumberGameWithGuessList() {
        guesses = new ArrayList<>();
    }

    private String ensureValidGuess(String guess) {
        try {
            int n = Integer.parseInt(guess);
            return guess;
        } catch (NumberFormatException e) {

            System.out.println("Not valid. Guess must be an integer. Make another guess:");
            return ensureValidGuess(reader.next());
        }
    }

    protected void parseGuess(String guess) {
        String validGuess = ensureValidGuess(guess);
        guesses.add(Integer.parseInt(validGuess));
        super.parseGuess(validGuess);
    }

    protected String endGame() {
        System.out.println("These were your guesses: " + guesses.toString());
        return super.endGame();
    }

}