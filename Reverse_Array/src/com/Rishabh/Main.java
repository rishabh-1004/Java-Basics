package com.Rishabh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static int[] fill_Array(int n){
        int[] array=new int[n];
        System.out.println("Enter "+n+" elements for the array.");
        for(int i=0;i<=array.length-1;i++){
            array[i]= sc.nextInt();
        }
        return array;
    }
    public static int[] reverseArray(int[] array){
        int[] reverseArray=new int[array.length];

        for(int i=(array.length)-1,j=0;i>=0;i--,j++){
            System.out.println(i+"" + j);
            reverseArray[j]=array[i];
        }

        return reverseArray;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int[] arr=fill_Array(size);
        int[] reverse_Array=reverseArray(arr);

        System.out.println("The first array is : "+ Arrays.toString(arr));
        System.out.println("The first array is : "+ Arrays.toString(reverse_Array));

    }
}
