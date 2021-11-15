package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int lveleCompleted = 5;
        int bonus = 100;

       /*
       if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but grater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score less than 1000");
        } else {
            System.out.println("Got her");
        }*/

        if (gameOver) {
            int finalScore = score + (lveleCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        score = 10000;
        lveleCompleted = 8;
        bonus = 200;
        if (gameOver){
            int finalScore = score + (lveleCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
         }


    }
}
