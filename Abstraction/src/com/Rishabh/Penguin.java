package com.Rishabh;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I dont know how to fly.. Rather take a swim.");
    }
}
