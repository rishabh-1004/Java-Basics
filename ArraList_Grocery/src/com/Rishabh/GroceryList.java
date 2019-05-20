package com.Rishabh;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList= new ArrayList<String>();

    public void addItems(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public String getElement(int position){
        return groceryList.get(position);
    }

    public String searchItem(String item){
        boolean exists=groceryList.contains(item);
        int position =getPosition(item);
        if(position >=0 ){
            return (groceryList.get(position)+" found at "+position+ " ." );
        }
        else{
            return("Item Not Found");
        }
    }

    public int modifyItem(String item1,String item2){
        boolean exists=groceryList.contains(item1);
        if(exists) {
            int position = getPosition(item1);
            groceryList.set(position, item2);
            return 1;
        }else{
            return -1;
        }

    }

    private int getPosition(String item){
        int position =groceryList.indexOf(item);
        return position;
    }

    public int removeItem(String item){
        boolean exists=groceryList.contains(item);
        if(exists) {
            groceryList.remove(item);
            return 1;
        }else{
            return -1;
        }

    }

}
