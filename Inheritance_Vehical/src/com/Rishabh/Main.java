package com.Rishabh;

public class Main {

    public static void main(String[] args) {
	    Vehicle car1=new Vehicle("Car1","2",12,1);
        Vehicle car2=new Vehicle("Car2","3",13,1);

        System.out.println(car1.getCar());

        Car car3= new Car("Car3","12",23,1,4,2,6,false);
        car3.move(6,2);
        car3.changeVelocity(4,7);
        car3.changeGear(3);
        System.out.println(car3.getCar());

    }
}
