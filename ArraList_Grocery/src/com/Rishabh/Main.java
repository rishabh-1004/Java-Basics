package com.Rishabh;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GroceryList grocery = new GroceryList();

        grocery.addItems("Bread");
        System.out.println(" The list is " + grocery.getGroceryList());
        grocery.addItems("Choclate");
        System.out.println(" The list is " + grocery.getGroceryList());
        String position=grocery.searchItem("Choclate");
        System.out.println("Found At + "+position);
        grocery.removeItem("Bread");
        System.out.println(" The list is " + grocery.getGroceryList());
        grocery.addItems("Powder");
        grocery.addItems("Cocaine");
        ArrayList<String> s= grocery.getGroceryList();
        for(String obj:s){
            System.out.println(obj);
        }
    }
}
