package com.Rishabh;

public class BreadRollType {
    private int bread_Roll_Type;
    private int bread_Roll_Price;
    private String bread_Roll_selected;


    public BreadRollType(int bread_Roll_Type) {
        this.bread_Roll_Type = bread_Roll_Type;
        price(bread_Roll_Type);
    }

    public void list(){
        System.out.println("1.Roasted (Rs.40)");
        System.out.println("2.Chilli Cheese (Rs.40)");
        System.out.println("3.Roasted Cheese (Rs.40)");
        System.out.println("4.Plain (Rs.40)");
    }
    private void price(int bread_Roll_Type){
        switch(bread_Roll_Type){
            case 1:
                this.bread_Roll_Price=40;
                this.bread_Roll_selected="Roasted";
                break;
            case 2:
                this.bread_Roll_Price=30;
                this.bread_Roll_selected="Chilli Cheese";
                break;
            case 3:
                this.bread_Roll_Price=60;
                this.bread_Roll_selected="Roasted Cheese";
                break;
            case 4:
                this.bread_Roll_Price=20;
                this.bread_Roll_selected="Plain";
                break;
            default:
                this.bread_Roll_Type=20;
                this.bread_Roll_selected="Plain";
                break;
        }
    }

    public int getBread_Roll_Type() {
        return bread_Roll_Type;
    }

    public int getBread_Roll_Price() {
        return bread_Roll_Price;
    }

    public String getBread_Roll_selected() {
        return bread_Roll_selected;
    }
}
