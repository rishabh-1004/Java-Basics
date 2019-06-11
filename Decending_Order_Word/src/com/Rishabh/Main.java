package com.Rishabh;

import java.util.*;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static String sortCharacter(String s){
        char[] word=new char[s.length()];
        word=s.toCharArray();
        Arrays.sort(word);
        StringBuilder sb=new StringBuilder(s.length());
        for(int i=(s.length()-1);i>=0;i--){
            sb.append(word[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1=sc.nextLine();
        String result=sortCharacter(s1.toLowerCase());
        System.out.println(result);


    }
}
