package com.accenture.incredibles.pokémon.models;

public class Pokémon {
    public String name;
    public String type;
    public String defense;
    public String attack;

    public void fight(){
        System.out.println(name + "attacks.");
    }
}
