package com.accenture.incredibles.animal;

import com.accenture.incredibles.animal.methods.App;

public class AnimalApp {
    public static void main(String[] args) {
        App app = new App();

        System.out.println("Welcome to the animal listing app.\n" +
                "To add type 'add', to see the animals type 'show', " +
                "to hear the animals type 'sound'.\n" +
                "If you want to leave type 'exit'! ");

        app.execute();
    }
}
