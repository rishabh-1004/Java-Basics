package com.Rishabh;

import java.util.ArrayList;
import java.util.Scanner;

class ShoppingItem{
    private String name;
    private int price;
    private int discount;

    public ShoppingItem(String name, int prize, int discount) {
        this.name = name;
        this.price = prize;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public int getPrize() {
        return price;
    }

    public int getDiscount() {
        this.discount=this.price*(this.discount/100);

        return discount;
    }
}

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static ArrayList<ShoppingItem> createList(int no_of_items){
        ArrayList<ShoppingItem> shoppingItems=new ArrayList<>();

        for(int i=0;i<no_of_items;i++){
            String list=sc.nextLine();
            String[] words=list.split(",",3);
            shoppingItems.add(new ShoppingItem(words[0],Integer.parseInt(words[1]),Integer.parseInt(words[2])));
        }
        return shoppingItems;
    }
    public static void main(String[] args) {
        int no_of_item=sc.nextInt();
        sc.nextLine();
        System.out.println(no_of_item);

        ArrayList<ShoppingItem> list=createList(no_of_item);
        ShoppingItem min=list.get(0);
        int minimum=list.get(0).getDiscount();
        for (ShoppingItem obj:list){
            if(obj.getDiscount()<minimum){
                minimum=obj.getDiscount();
                System.out.println("Minimum: "+minimum );
                min=obj;
            }
        }
        System.out.println(min.getName());
    }
}
