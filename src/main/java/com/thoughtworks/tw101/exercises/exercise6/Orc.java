package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private int hitPoints;
    private String name;

    public Orc() {
        name = "Orc";
        hitPoints = 20;
    }

    public void takeDamage(int n) {
        hitPoints += n;
    }
    public void reportStatus(){
        System.out.println(name + " has " + hitPoints + " hit points");
    }
}
