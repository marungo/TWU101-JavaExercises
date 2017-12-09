package com.thoughtworks.tw101.exercises.exercise7;

import com.thoughtworks.tw101.exercises.exercise8.RandomNumberGenerator;
import java.util.Scanner;

public class RandomNumberGame {

    private RandomNumberGenerator gen;
    private Scanner reader;
    private int randomNum;
    private boolean gameOver;

    public RandomNumberGame() {
        gen = new RandomNumberGenerator();
        randomNum = gen.getRandomNum();
        gameOver = false;
        reader = new Scanner(System.in);
    }

    private String checkNum(int n) {
        if (n == 0) {
            gameOver = true;
            return "You quit.";
        }

        if (n == randomNum) {
            gameOver = true;
            return "Correct! Game Over";
        } else if (n < randomNum)
            return "Too low";
        else
            return "Too high";
    }

    private void playRound(Scanner reader) {
        System.out.println("Guess an integer between 1 and 100. Enter 0 to quit: ");
        int n = reader.nextInt();
        System.out.println(checkNum(n));
    }

    private void reset() {
        randomNum = gen.getRandomNum();
        gameOver = false;
    }

    private void playGame() {
        reset();
        while (gameOver == false) {
            playRound(reader);
        }
    }

    public void start() {
        boolean playerWantsIn = true;

        while (playerWantsIn) {
            System.out.println("Do you want to play Guess That Number? Y or N");
            String answer = reader.next();
            if (answer.equals("Y")) {
                playGame();
            } else
                playerWantsIn = false;
        }
        reader.close();
    }

}