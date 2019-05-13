package com.Rishabh;

public class Vehicle {
    private String name;
    private String size;
    private static int car_Count=0;
    private int currentVelocity;
    private int currentDirection;

    public void steer(int direction){
        this.currentDirection=direction;
        System.out.println("Vehicle.steer(): Steering at "+this.currentDirection+" degrees");

    }
    public void move(int velocity, int direction){
        this.currentVelocity=velocity;
        this.currentDirection=direction;
        System.out.println("Change Velocity: Vehicle - Velocity changed to " + velocity +" and in "+ direction +" direction");
    }

    public Vehicle(){
        this("Default","Default" , 0,1);
    }

    public Vehicle(String name, String size, int currentVelocity, int currentDirection) {
        this.name = name;
        this.size = size;
        this.currentVelocity = currentVelocity;
        this.currentDirection = currentDirection;
        car_Count+=1;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public static int getCar() {
        return car_Count;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
