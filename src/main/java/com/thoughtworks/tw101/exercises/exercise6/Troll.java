package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private int hitPoints;
    private String name;

    public Troll() {
        name = "Troll";
        hitPoints = 40;
    }

    public void takeDamage(int n) {
        hitPoints += (float) n/2;
    }

    public void reportStatus() {
        System.out.println(name + " has " + hitPoints + " hit points");
    }


}
