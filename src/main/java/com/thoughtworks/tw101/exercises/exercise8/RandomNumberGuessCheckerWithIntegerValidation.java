package com.thoughtworks.tw101.exercises.exercise8;
import com.thoughtworks.tw101.exercises.exercise7.RandomNumberGuessChecker;

public class RandomNumberGuessCheckerWithIntegerValidation extends RandomNumberGuessChecker {
    public boolean isValidGuess(String guess) {
        try {
            Integer.parseInt(guess);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
