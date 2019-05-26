package com.Rishabh;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void printList(LinkedList<String> newList){
        Iterator<String> i = newList.iterator();
        while(i.hasNext()){
            System.out.println("Element :" + i.next());
        }
        System.out.println("=======Done========");

    }

    public static boolean add_In_order(LinkedList<String> linkedList , String new_element){
        ListIterator<String> i = linkedList.listIterator();
        while(i.hasNext()){
            int compare=i.next().compareTo(new_element);
            if(compare==0){
                System.out.println(new_element+" is already in the list");
                return false;

            }
            if(compare>0){
                i.previous();
                i.add(new_element);
                return true;
            }
            if (compare<0){

            }
        }
        i.add(new_element);
        return true;
    }

    public static void main(String[] args) {
        LinkedList<String> newList=new LinkedList<String>();
        add_In_order(newList, "Bread");
        add_In_order(newList, "Butter");
        add_In_order(newList, "Cream");
        add_In_order(newList, "Sugar");
        add_In_order(newList, "Bun");
        add_In_order(newList, "Apple");
        printList(newList);


        newList.remove("Bun");
        printList(newList);

    }
}
