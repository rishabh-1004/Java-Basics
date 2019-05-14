package com.Rishabh;

public class Additional_Items {
    private int lettus;
    private int tomato;
    private int carrot;
    private int salami;
    private int total_price;

    public Additional_Items(int lettus, int tomato, int carrot, int salami) {
        this.lettus = lettus;
        this.tomato = tomato;
        this.carrot = carrot;
        this.salami = salami;
        set_price(this.lettus,this.tomato,this.carrot,this.salami);
    }

    private void set_price(int lettus,int tomato,int carrot,int salami){
        int total=0;
        if(lettus==1)
            total+=10;
        if(tomato==1)
            total+=10;
        if(carrot==1)
            total+=10;
        if(salami==1)
            total+=10;
        this.total_price=total;
    }

    public int getLettus() {
        return lettus;
    }

    public int getTomato() {
        return tomato;
    }

    public int getCarrot() {
        return carrot;
    }

    public int getSalami() {
        return salami;
    }

    public int getTotal_price() {
        return total_price;
    }
}
