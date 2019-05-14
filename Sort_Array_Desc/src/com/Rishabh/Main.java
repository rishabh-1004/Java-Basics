package com.Rishabh;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static int[] fillArray(int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+n+" elements for the array ");
        int[] array1=new int[n];
        for (int i=0 ;i<n;i++){
            array1[i]=sc.nextInt();
        }
        return array1;
    }
    public static void displayArray(int[] array1){
        System.out.println("Elements of array are: ");
        for (int obj:array1){
            System.out.print(obj+ " ");
        }
        System.out.println();
    }
    public static int[] sortArray(int[] array1){
        int[] sorted_array=new int[array1.length];
        for (int i=0;i<array1.length;i++){
            sorted_array[i]=array1[i];
        }
        boolean flag=true;
        while (flag){
            flag=false;
            for(int i=0;i<sorted_array.length-1;i++) {
                if(sorted_array[i]<sorted_array[i+1]){
                    int temp=sorted_array[i];
                    sorted_array[i]=sorted_array[i+1];
                    sorted_array[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sorted_array;
    }

    public static void main(String[] args) {
	    int[] array1=fillArray(5);
	    displayArray(array1);
	    int[] sortedArray=sortArray(array1);
	    displayArray(sortedArray);

    }
}
