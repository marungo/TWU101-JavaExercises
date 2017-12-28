package com.thoughtworks.tw101.exercises.exercise7;

public abstract class RandomNumberGuessChecker {
    private int randomNum;
    private boolean gameOver;

    public RandomNumberGuessChecker() {
        this.randomNum = generateRandomNum();
        gameOver = false;
    }

    protected boolean isGameOver() {
        return gameOver;
    }

    protected void resetChecker() {
        randomNum = generateRandomNum();
        gameOver = false;
    }
    private int generateRandomNum() {
        return (int) (Math.random() * 100);
    }

    private void compareGuess(int guessInt) {
        if (guessInt == randomNum)
            gameOver = true;
        else if (guessInt < randomNum)
            System.out.println("Too Low");
        else
            System.out.println("Too High");
    }

    public abstract boolean isValidGuess(String guess);

    public void checkGuess(String guess) {
        if (!isValidGuess(guess))
            System.out.println("Not a valid guess");
        else {
            int guessInt = Integer.parseInt(guess);
            compareGuess(guessInt);
        }
    }

}
