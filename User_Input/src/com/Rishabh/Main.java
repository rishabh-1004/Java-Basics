package com.Rishabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your birth year");
        boolean hasNextInt= sc.hasNextInt();
        if(hasNextInt){
            int age=sc.nextInt();
            sc.nextLine();//always use after int to handle enter key

            System.out.println("Enter your Name: ");
            String name=sc.nextLine();
            age=2018-age;

            if(age>1 && age<100)
                System.out.println("Your name is "+name+" and your age is "+age+".");
            else
                System.out.println("Invalid Year");
        }else{
            System.out.println("Unable to parse age");
        }

    }
}
