package com.Rishabh;

public class Main {

    public static void main(String[] args) {
	    Baseball joe=new Baseball("joe");
	    Football john=new Football("john");
	    Cricket doe=new Cricket("doe");


	    Team<Football> superheros=new Team<Football>("superheros");
	    //superheros.addPlayer(joe);
	    superheros.addPlayer(john);
	    //superheros.addPlayer(doe);

        System.out.println("Size of superheros "+superheros.numPlayers());

        Team<Baseball> baseball=new Team<>("baseball");
        baseball.addPlayer(joe);

        Team<Cricket> cricket=new Team<>("India");
        cricket.addPlayer(doe);

        Team<Football> melbourne=new Team<>("Melbourne");
        Football banks=new Football("Banks");
        melbourne.addPlayer(banks);

        Team<Football> chlsea=new Team<>("chelsea");
        Team<Football> arsenal=new Team<>("Arsenal");

        chlsea.compareResult(arsenal,1,0);
        chlsea.compareResult(superheros, 3, 8);

//        cricket.compareResult(baseball, 1, 1);

        System.out.println("Ranking");
        System.out.println(chlsea.getName()+ ":" +chlsea.ranking());
        System.out.println(arsenal.getName()+ ":" +arsenal.ranking());
        System.out.println(melbourne.getName()+ ":"+ melbourne.ranking());
        System.out.println(superheros.getName()+":"+ superheros.ranking());
    }
}
