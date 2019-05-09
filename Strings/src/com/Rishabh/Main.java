package com.Rishabh;

public class Main {

    public static void main(String[] args) {
	    //Primitive Data types
        //bool
        //short
        //int
        //float
        //double
        //char
        //boolean
        //long

        //String is a non primitive data type

        String myString1="This a string";
        System.out.println("MyString is : "+ myString1);
        myString1=myString1+" and here is some more String";
        System.out.println("MyString is : "+ myString1);

        String numberString="140";
        System.out.println("Number String: " + numberString );
        int num_=14;
        numberString=numberString+num_;
        System.out.println("NumberString =  "+ numberString);
        System.out.println("Java converts int to string if the left hand side element is a string.");
    }
}
