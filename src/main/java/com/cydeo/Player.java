package com.cydeo;

public abstract class Player {  // I am not going to create object from this class, this is a template , that is why it is abstract
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}