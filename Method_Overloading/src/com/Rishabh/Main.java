package com.Rishabh;

public class Main {

    public static void calulateScore(String name,int score){
        System.out.println(name +" has scored " + score +" points");
    }
    public static void calulateScore(int score){
        System.out.println("Unnamed has scored " + score +" points");
    }
    public static void calulateScore(){
        System.out.println("No player has scored any points");
    }

    public static void main(String[] args) {

        calulateScore("Rishabh",500);
        calulateScore(500);
        calulateScore();
    }
}
