package com.Rishabh;

import java.util.ArrayList;

public class Team {
    private String name;
    private int played=0;
    private int won=0;
    private int lost=0;
    private int tied=0;

    private ArrayList<Player> members =new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public int numPlayers(){
        return this.members.size();
    }
    public boolean addPlayer(Player player){
        if(members.contains(player)){
            System.out.println(player.getName()+ " is already selected in the team.");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName()+" is now selected in the" +this.name+" team.");
            return false;
        }
    }
    public void compareResult(Team opponent,int ourScore,int theirScore){
        if(ourScore>theirScore)
            won++;
        else if(ourScore<theirScore)
            lost++;
        else if(ourScore==theirScore)
            tied++;
        played++;
        if(opponent!=null)
            compareResult(null, ourScore, theirScore);

    }
    public int ranking(){
        return (won*2)+tied;
    }



}
