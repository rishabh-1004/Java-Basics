package com.Rishabh;

public class HamBurger {
    private BreadRollType breadRollType;
    private int meat;
    private Additional_Items addons;
    private int total;

    public HamBurger(BreadRollType breadRollType, int meat, Additional_Items addons) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.addons = addons;
        calculatePrice();
    }

    public void calculatePrice(){
        if (this.meat==1)
            this.total=breadRollType.getBread_Roll_Price()+20+addons.getTotal_price();
        else
            this.total=breadRollType.getBread_Roll_Price()+addons.getTotal_price();
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public int getMeat() {
        return meat;
    }

    public Additional_Items getAddons() {
        return addons;
    }

    public int getTotal() {
        return total;
    }
}
