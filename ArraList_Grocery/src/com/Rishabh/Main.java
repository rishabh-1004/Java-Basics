package com.Rishabh;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static GroceryList grocery = new GroceryList();


    public static void addItem(){
        System.out.println("Enter element to add: ");
        String item=sc.nextLine();
        grocery.addItems(item);
        System.out.println(item+" added to grocery list.");
    }

    public static void removeItem(){
        System.out.println("Enter the element to be Added: ");
        String item=sc.nextLine();
        int confirmation=grocery.removeItem(item);
        if(confirmation==1)
            System.out.println(item+" is removed from the list.");
        else
            System.out.println(item+" is not in list.");

    }
    public static void searchItem(){
        System.out.println("Enter an element to search: ");
        String item=sc.nextLine();
        String result= grocery.searchItem(item);
        System.out.println(result);

    }
    public static void displayList(){
        System.out.println("Items in grocery list:");
        for(String elem : grocery.getGroceryList()){
            System.out.println(elem);
        }
    }
    public static void modifyItem(){
        System.out.println("Enter item to replace:");
        String prev_item=sc.nextLine();
        System.out.println("Enter new item:");
        String new_item=sc.nextLine();
        int confirmation=grocery.modifyItem(prev_item, new_item);
        if(confirmation==1)
        {
            System.out.println(prev_item+ " has been replaced by "+new_item+".");
        }else{
            System.out.println("Item was not found to be replaced.");
        }

    }

    public static void main(String[] args) {


        int choice =0;
        while(choice<6) {
            System.out.println("Welcome to Grocery List");
            System.out.println("1.Add Item");
            System.out.println("2.Remove Item");
            System.out.println("3.Search Item");
            System.out.println("4.View List");
            System.out.println("5.Modify Item");
            System.out.println("Enter 6 to exit");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        addItem();
                        break;
                    case 2:
                        removeItem();
                        break;
                    case 3:
                        searchItem();
                        break;

                    case 4:
                        displayList();
                        break;
                    case 5:
                        modifyItem();
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
        }

        }
    }

