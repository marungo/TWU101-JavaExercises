package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {

    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

    private static void drawHorizontalLine(int n, String s) {
        for (int i=0;i<n;i++)
            System.out.print(s);
    }

    private static void drawLevel(int numSpaces, int numAsterisks){
        drawHorizontalLine(numSpaces," ");
        drawHorizontalLine(numAsterisks, "*");
        drawHorizontalLine(numSpaces," ");
        System.out.println();
    }

    private static void drawNameOrMiddleLine(boolean name, int n) {
        if (name)
            System.out.println("MR Ngo");
        else {
            drawLevel(0,n*2-1);
        }
    }

    private static void drawIsoscelesOrDiamond(int n, boolean diamond, boolean name) {
        int numSpaces = n-1;
        int numAsterisks = 1;

        for (int i=0;i<n-1;i++) {
            drawLevel(numSpaces, numAsterisks);
            numSpaces--;
            numAsterisks += 2;
        }

        drawNameOrMiddleLine(name, n);

        if (diamond) {
            for (int j=0;j<n-1;j++) {
                numSpaces++;
                numAsterisks -= 2;
                drawLevel(numSpaces, numAsterisks);
            }
        }
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        drawIsoscelesOrDiamond(n, false, false);
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawIsoscelesOrDiamond(n, true, false);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        drawIsoscelesOrDiamond(n, true, true);
    }
}
