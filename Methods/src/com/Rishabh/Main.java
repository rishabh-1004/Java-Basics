package com.Rishabh;

public class Main {

    public static void main(String[] args) {

        boolean gameOver=true;
        int score=800;
        int levelCompleted =8;
        int bonus=100;
        int finalScore=calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Final Score 1 = "+finalScore);


        score=1000;
        levelCompleted =10;
        bonus=100;
        finalScore=calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Final Score 1 = "+finalScore);

    }

    public static int calculateScore( boolean gameOver, int score , int levelCompleted,int bonus ){

        if(gameOver==true){
            int finalScore=score+(levelCompleted*bonus);
            return finalScore;
        }

        return -1;
    }
}
