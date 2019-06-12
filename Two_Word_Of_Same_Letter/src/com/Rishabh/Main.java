package com.Rishabh;

import java.util.Scanner;

public class Main {

    public static String checkSDtringValues(String s1,String s2){
        boolean FirstCheck=false;
        for(int i=0;i<=s1.length()-1;i++){
            if(s2.indexOf(s1.charAt(i))==-1 ){
                return "Different";
            }
        }
        for(int i=0;i<=s2.length()-1;i++){
            if(s1.indexOf(s2.charAt(i))==-1 ){
                return "Different";
            }
        }

        return "Same";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        String result=checkSDtringValues(s1, s2);
        System.out.println(result);
    }
}
