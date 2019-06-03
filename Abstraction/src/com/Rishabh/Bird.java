package com.Rishabh;

public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" is pecking.");
    }

    @Override
    public void breath() {
        System.out.println("Fly bird Fly");
    }
    public abstract void fly();
}
