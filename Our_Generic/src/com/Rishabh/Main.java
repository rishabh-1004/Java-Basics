package com.Rishabh;

public class Main {

    public static void main(String[] args) {
	    Baseball joe=new Baseball("joe");
	    Football john=new Football("john");
	    Cricket doe=new Cricket("doe");

	    Team superheros=new Team("superheros");
	    superheros.addPlayer(joe);
	    superheros.addPlayer(john);
	    superheros.addPlayer(doe);

        System.out.println("Size of superheros "+superheros.numPlayers());

    }
}
