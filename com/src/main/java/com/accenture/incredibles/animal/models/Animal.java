package com.accenture.incredibles.animal.models;

public abstract class Animal {
    public String species;
    public String name;

    public abstract void makeSound();

    public void tellUsAboutYou() {
        System.out.println("Hello! \n My name is "
                + name + " and I am a " + species + "!" );
    }
}
