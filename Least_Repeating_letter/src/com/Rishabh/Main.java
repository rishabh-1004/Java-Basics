package com.Rishabh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);

    public static HashMap<Character,Integer> frequency_of_Characters(String s){
        HashMap<Character,Integer> letter_frequency=new HashMap<>();
        for(char obj: s.toCharArray()){
            if(letter_frequency.containsKey(obj)){
                Integer count=letter_frequency.get(obj);
                letter_frequency.put(obj,count+1 );
            }else{
                letter_frequency.put(obj, 1);
            }
        }
        return letter_frequency;
    }
    public static ArrayList least_Frequency(HashMap<Character,Integer> map){
        ArrayList<Character> least_frequncy_char=new ArrayList<>();
        int min=100;
        for(char key: map.keySet()){
            if(map.get(key)<min){
                min=map.get(key);
            }
        }
        for(char key:map.keySet()){
            if (map.get(key)== min){
                least_frequncy_char.add(key);
            }
        }


        return least_frequncy_char;
    }
    public static void displayList(ArrayList<Character> list){
        for(char obj:list)
            System.out.println(obj);
    }

    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String s=sc.nextLine();
        HashMap<Character,Integer>map =frequency_of_Characters(s);
        ArrayList<Character> least_frequency_list=least_Frequency(map);
        displayList(least_frequency_list);
    }
}
