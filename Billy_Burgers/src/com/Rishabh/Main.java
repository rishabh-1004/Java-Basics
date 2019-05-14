package com.Rishabh;


public class Main {

    public static void main(String[] args) {

        BreadRollType bread=new BreadRollType(1);
        bread.list();

        System.out.println(bread.getBread_Roll_Price());
        System.out.println(bread.getBread_Roll_selected());
        Additional_Items addons=new Additional_Items(1,1,1,1);
        System.out.println(addons.getTotal_price());

        HamBurger burger=new HamBurger( bread,1,addons );
        System.out.println(burger.getTotal());

    }
}
