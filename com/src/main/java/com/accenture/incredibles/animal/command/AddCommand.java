package com.accenture.incredibles.animal.command;

import com.accenture.incredibles.animal.methods.GetInput;
import com.accenture.incredibles.animal.models.Animal;
import com.accenture.incredibles.animal.models.Cat;
import com.accenture.incredibles.animal.models.Dog;

import java.util.List;
import java.util.Scanner;

public class AddCommand implements Command{
    private List<Animal> animals;
    Scanner input;

    public AddCommand(List<Animal> animals, Scanner input ) {
        this.animals = animals;
        this.input = input;
    }

    public boolean execute() {
        System.out.println("What do you want to add? (Cat or Dog)");
        System.out.print(">> ");
        String species = input.nextLine();
        System.out.println("What's the " + species.toLowerCase() +"s name?");
        System.out.print(">> ");
        String name = input.nextLine();

        if ("cat".equals(species.toLowerCase())) {
            Cat cat = new Cat();
            cat.name = name;
            cat.species = species.toLowerCase();
            animals.add(cat);
            System.out.println("You added " + name + " the cat to your List!");
        } else if ("dog".equals(species.toLowerCase())) {
            Dog dog = new Dog();
            dog.name = name;
            dog.species = species.toLowerCase();
            animals.add(dog);
            System.out.println("You added " + name + " the dog to your List!");
        } else {
            System.out.println("Ooops something went wrong. Please try again!");
        }
        return true;
    }

    public boolean shouldExecute(String input) {
        return "add".equals(input.toLowerCase());
    }
}
