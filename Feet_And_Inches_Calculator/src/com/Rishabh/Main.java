package com.Rishabh;

public class Main {

    public static double calcFeetAndInchestoCentimeter(int feet,int inches) {
        if(feet>0 && inches<12 ){
            double centi=(feet*12)*2.54+ (inches*2.54);
            return centi;
        }else{
            return -1;
        }

    }
    public static double calcFeetAndInchestoCentimeter(int inches) {
        if(inches<12 ){
            double centi=inches*2.54;
            return centi;
        }else{
            return -1;
        }

    }

    public static void main(String[] args) {
        int feet=6;
        int inches=2;
        double centi=calcFeetAndInchestoCentimeter(feet,inches);
        if (centi>=0)
            System.out.println(feet+" feet and "+inches+" in centimeter is " + centi);
        else
            System.out.println("Invalid Input");
        centi=calcFeetAndInchestoCentimeter(inches);
        if (centi>=0)
            System.out.println(inches+" in centimeter is "+ centi);
        else
            System.out.println("Invalid Input");
    }
}
