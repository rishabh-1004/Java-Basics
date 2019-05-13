package com.Rishabh;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    public Car(String name, String size, int currentVelocity, int currentDirection, int wheels, int doors, int gears, boolean isManual) {
        super(name, size, currentVelocity, currentDirection);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
    }

    public void changeGear(int gear){
        System.out.println("Gear Changed from  "+ this.gears +" to "+ gear +" .");
        this.gears=gear;
    }
    public void changeVelocity(int speed,int direction){
        move(speed,direction);
        System.out.println("Change Velocity: Car - Velocity changed to " + speed +" and in "+ direction +" direction");
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }
}
