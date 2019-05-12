package com.Rishabh;

public class Main {
    public static int sum_of_digits(int n){

        if (n<0){
            return -1;
        }
        int sum_=0;
        while (n>0){
            int digit=n%10;
            sum_+=digit;
            n=n/10;
        }

        return sum_;
    }
    public static void printSum(int number,int sum_of_number){
        if(sum_of_number>0)
            System.out.println("Sum of digits of "+ number+ " is :" + sum_of_number);
        else
            System.out.println("Invalid Number");
    }

    public static void main(String[] args) {

        int number=225;
        int sum_of_number=sum_of_digits(number);
        printSum(number,sum_of_number);
        number=3131;
        sum_of_number=sum_of_digits(number);
        printSum(number,sum_of_number);

    }
}
