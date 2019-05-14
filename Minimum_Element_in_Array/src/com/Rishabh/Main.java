package com.Rishabh;

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
    public static int findMin(int[] array){
        int min_=array[0];
        for(int obj:array){
            if(obj < min_){
                min_=obj;
            }
        }
        return min_;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int[] arr=fill_Array(size);
        System.out.println("Minimum number in the array is : "+ findMin(arr));
    }
}
