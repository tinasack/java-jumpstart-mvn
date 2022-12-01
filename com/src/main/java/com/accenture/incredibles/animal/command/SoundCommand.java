package com.accenture.incredibles.animal.command;

import com.accenture.incredibles.animal.models.Animal;

import java.util.List;

public class SoundCommand implements Command{

    private List<Animal> animals;

    public SoundCommand(List<Animal> animals) {
        this.animals = animals;
    }

    public boolean execute() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
        return true;
    }


    public boolean shouldExecute(String input) {
        return "sound".equals(input.toLowerCase());
    }
}
