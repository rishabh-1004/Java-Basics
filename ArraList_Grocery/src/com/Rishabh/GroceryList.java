package com.Rishabh;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList= new ArrayList<String>();

    public ArrayList<String> addItems(String item){
        groceryList.add(item);
        return groceryList;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public String getElement(int position){
        return groceryList.get(position);
    }

    public String searchItem(String item){
        boolean exists=groceryList.contains(item);
        int position =groceryList.indexOf(item);
        if(position >=0 ){
            return groceryList.get(position);
        }
        else{
            return("Item Not Found");
        }
    }
    public void removeItem(String item){
        groceryList.remove(item);
    }

}
