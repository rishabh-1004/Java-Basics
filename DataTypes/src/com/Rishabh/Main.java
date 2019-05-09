package com.Rishabh;
import java.text.DecimalFormat;

public class Main {

    private static  DecimalFormat df2= new DecimalFormat("#.##");

    public static void main(String[] args) {

        // Width of int=32
        int minInt = -2_147_483_648;
	    int maxInt = 2_147_483_647;
        int total_= minInt/2;
        System.out.println("Total_ = "+total_ );

	    // Width of byte=8
	    byte maxValue = 127;
	    byte minValue = -128;
	    byte total_byte= (byte) (maxValue/2);
        System.out.println("total_byte= "+total_byte);

	    // Width of short =16
	    short myShortMin = -32768;
	    short myShortMax = 32767;
	    short total_short= (short) (myShortMin/2);
        System.out.println("total_short= "+total_short);

	    // Width of long = 64
        long longMin=-9_223_372_036_854_775_808L;
        long longMax=9_223_372_036_854_775_807L;
        long total_long=longMin/2;
        System.out.println("Total_long = "+total_long);

        //Float and Double
        int IntNumber=5;
        // Width is= 32(4bytes)
        float floatNumber=5f;
        //Width is=64(8 bytes)
        double doubleNumber=5d;

        System.out.println("IntNumber = "+IntNumber); //5
        System.out.println("floatNumber = "+floatNumber); //5.0
        System.out.println("DoubleNumber = "+ doubleNumber); //5.0

        System.out.println("IntNumber = "+IntNumber/2); //2
        System.out.println("floatNumber = "+floatNumber/2); //2.5
        System.out.println("DoubleNumber = "+ doubleNumber/2); //2.5

        System.out.println("IntNumber = "+IntNumber/3); //1
        System.out.println("floatNumber = "+floatNumber/3); //1.6666666
        System.out.println("DoubleNumber = "+ doubleNumber/3); //1.6666666666666667

        //Showing specific digits after decimal for double

        double pi = 3.14159265359;
        System.out.println("pi :"+pi);
        System.out.println("Formatted pi :"+df2.format(pi));

        //Char
        //Width=16 (2 bytes)
        char myChar='A';
        System.out.println("myChar : "+myChar);

        //boolean
        //true and false in small case
        boolean myBool=true;

    }
}
