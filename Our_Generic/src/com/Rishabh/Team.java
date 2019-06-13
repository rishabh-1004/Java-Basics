package com.Rishabh;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int played=0;
    private int won=0;
    private int lost=0;
    private int tied=0;

    private ArrayList<T> members =new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int numPlayers(){
        return this.members.size();
    }
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println( player.getName()+ " is already selected in the team.");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName()+" is now selected in the" +this.name+" team.");
            return false;
        }
    }
    public void compareResult(Team<T> opponent,int ourScore,int theirScore){
        
        String message = null;
        
        if(ourScore>theirScore){
            won++;
            message=" beat ";
        }
        else if(ourScore<theirScore){
            lost++;
            message=" lost to ";
        }
        else if(ourScore==theirScore){
            tied++;
            message="drew with";
        }
        played++;
        if(opponent!=null) {
            System.out.println(this.getName()+ message+ opponent.getName());
            compareResult(null, ourScore, theirScore);

        }
    }
    public int ranking(){
        return (won*2)+tied;
    }



}
