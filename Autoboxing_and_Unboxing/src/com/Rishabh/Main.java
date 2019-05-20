package com.Rishabh;
import java.util.*;

public class Main {

    public static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for (int i=0;i<=10;i++){
            System.out.println("Enter the element: ");
            int elem=sc.nextInt();
            sc.nextLine();
            intArray.add(Integer.valueOf(elem));//Autoboxing --> Long Way
        }
        for (int i=0;i<=10;i++){
            System.out.println(i+" --->> "+ intArray.get(i).intValue());//Unboxing -->Long way
        }
        Integer intValue=56; //Integer.valueOf(56) runs this on compile time
        int number=intValue;// On Compiling--> intValue.intValue(56)
    }
}
