package com.Rishabh;

public class Main {

    public static void main(String[] args) {
        boolean gameOver=true;
        int score=4000;
        int levelCompleted=5;
        int bonus=100;

//        if(score<5000 && score>1000)
//            System.out.println("Score is less than 5000 but greater than 1000");
//        else if (score<1000)
//            System.out.println("Score is less than 1000");
//        else
//            System.out.println("Score is greater than 5000");

            if(gameOver==true){
                int final_score= score + (levelCompleted*bonus);
                System.out.println("Final Score = "+final_score);
            }
            //finalScore= final_score Cannot acess as it outside block

            int second_score=8000;
            levelCompleted=8;
            if(gameOver==true){
                int final_score= second_score+(levelCompleted*bonus) ;
                System.out.println("Second Score : "+ final_score);
            }
    }
}
