package com.Rishabh;

public abstract class Animal {
    private String name;

    public abstract void eat();
    public abstract void breath();

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
