package com.Rishabh;

public class Main {

    public static void main(String[] args) {
        int result=1+2;
        System.out.println("1 + 2 = "+ result );

        int previous_result=result;

        result=previous_result-1;
        System.out.println(previous_result+ " - 1 = " + result);

        previous_result=result;

        result=previous_result*3;
        System.out.println(previous_result +" * 3 = " + result);

        previous_result=result;

        result=result/2;
        System.out.println(previous_result +" / 2 = " + result);

        previous_result=result;

        result=result%2;
        System.out.println(previous_result +" % 2 = " + result);

        result+=2;
        System.out.println("Result is now: "+ result);
        result-=2;
        System.out.println("Result is now: "+ result);
        result*=10;
        System.out.println("Result is now: "+ result);
        result/=2;
        System.out.println("Result is now: "+ result);

        boolean isAlien=false;
        if(isAlien==false)
            System.out.println("It is not an alien");

        int i=10;
        if (i != 100)
            System.out.println(i+" is is not equal to 100");

        i=70;
        if(i>60 && i>100)
            System.out.println("Number is greater than 60 and less than 100");

        boolean testcase1=true;
        if(testcase1==true || isAlien==true)
            System.out.println("Atleast one of these cases are true");

        boolean wasAlien = isAlien? true :false;
        if( wasAlien==false)
            System.out.println("It wasn't an alien" );
    }
}
