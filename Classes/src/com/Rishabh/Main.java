package com.Rishabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        Car porsche = new Car();
        System.out.println(" Set model for Car  ");
        String model=sc.nextLine();
        porsche.setModel(model);
        System.out.println("Model of car  "+ porsche.getModel() );

    }
}
