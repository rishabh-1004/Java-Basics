package com.Rishabh;

public class Main {

    public static void main(String[] args) {

        int switchNumber=1;

        switch(switchNumber){
            case 1:
                System.out.println("The number was one");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            default:
                System.out.println("The number was not 1 or 2");
                break;

        }
        String month="MAy";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Month is January ");
                break;
            case "february":
                System.out.println("Month is Februaray");
                break;
            case "march": case "april": case "may":
                System.out.println("Month was April May or March");
                break;
            default:
                System.out.println("Invalid Month");

        }

    }
}
