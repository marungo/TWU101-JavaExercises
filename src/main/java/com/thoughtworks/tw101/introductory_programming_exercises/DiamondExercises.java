package com.thoughtworks.tw101.introductory_programming_exercises;

import java.util.Collections;
import java.util.stream.IntStream;

public class DiamondExercises {

    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

    //    Isosceles Triangle
    private static void drawAnIsoscelesTriangle(int n) {
        drawIsoscelesOrDiamond(n, false, false);
    }

    //    Diamond
    private static void drawADiamond(int n) {
        drawIsoscelesOrDiamond(n, true, false);
    }

    //    Diamond with Name
    private static void drawADiamondWithYourName(int n) {
        drawIsoscelesOrDiamond(n, true, true);
    }

    private static void drawLevel(int numSpaces, int numAsterisks){
        String spaces = String.join("", Collections.nCopies(numSpaces, " "));
        String stars = String.join("", Collections.nCopies(numAsterisks, "*"));
        System.out.println(spaces + stars + spaces);
    }

    private static void drawNameOrMiddleLine(boolean name, int n) {
        if (name)
            System.out.println("MR Ngo");
        else
            drawLevel(0,n*2-1);
    }

    private static void drawIsoscelesOrDiamond(int n, boolean diamond, boolean putName) {
        IntStream.range(0,n-1).forEach(i -> drawLevel(n-1-i, 1+2*i));
        drawNameOrMiddleLine(putName, n);
        if (diamond)
            IntStream.range(0,n-1).forEach(i -> drawLevel(1+i,(n*2-1) - 2*(i+1)));
    }

}
