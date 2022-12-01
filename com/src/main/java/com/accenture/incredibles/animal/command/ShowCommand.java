package com.accenture.incredibles.animal.command;

import com.accenture.incredibles.animal.models.Animal;

import java.util.List;

public class ShowCommand implements Command{
    private List<Animal> animals;

    public ShowCommand(List<Animal> animals) {
        this.animals = animals;
    }

    public boolean execute() {
        for(Animal animal : animals) {
            animal.tellUsAboutYou();
        }
        return true;
    }

    public boolean shouldExecute(String input) {
        return "show".equals(input.toLowerCase());
    }
}
