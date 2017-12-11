package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's play a game.");
        // Lean solution to fulfill all game requirements. One class.
        OneClassRandomNumberGame game = new OneClassRandomNumberGame();
        game.play();
        game.closeReader();

        System.out.println("Now let's play this game again, with a different implementation.");
        // More scalable, hefty solution to game instructions. Multiple classes.
        RandomNumberGame game1 = new RandomNumberGame(new RandomNumberSimpleGuessChecker());
        game1.playGame();
        game1.playGame();
        game1.stopPlayingGames();

    }
}
