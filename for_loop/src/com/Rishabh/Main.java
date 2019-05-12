package com.Rishabh;

public class Main {

    public static double calculateInterest(double principal,double rate){
        return principal*(rate/100);
    }
    public static boolean isPrime(long num){
        if(num==1)
            return false;
        if(num==4)
            return false;
        for (long i=2;i< num/2;i++ ){
            if(num%i==0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
	    for(int i=0;i<5;i++){
	        System.out.println("Rs. 10000 at a interest of "+i+"% is "+calculateInterest(10000,i) );

        }
	    for(int i=8;i>1;i--){
            System.out.println("Rs. 10000 at a interest of "+i+"% is "+calculateInterest(10000,i) );
        }

	    // Checking for Prime Numbers
        int counter=0;
        for (long i=2;i<=500000000;i++){
            if( isPrime(i) ){
                System.out.println("Prime number = "+i);
                counter++;
                if(counter==10001){
                    System.out.println("6th Prime Number is : "+i);
                    break;
                }
            }
        }

    }
}
