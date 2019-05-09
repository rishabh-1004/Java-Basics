package com.Rishabh;

public class Main {

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour<0)
            return -1;

        long milesPerHour= Math.round(kilometersPerHour/1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometerPerHour) {
        long milesPerHour=toMilesPerHour(kilometerPerHour);
        if (milesPerHour==-1 )
            System.out.println("Invalid Value");
        else
            System.out.println(kilometerPerHour+"km/h = "+ milesPerHour +"mi/h");
    }
    public static void main(String[] args) {
            printConversion(5);
    }
}
