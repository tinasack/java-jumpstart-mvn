package com.accenture.incredibles.pokémon.commands;

import com.accenture.incredibles.pokémon.models.Trainer;

public class ExitPokémonCommands implements PokémonCommands {

    private Trainer trainer;

    public ExitPokémonCommands(Trainer trainer) {
        this.trainer = trainer;
    }

    public boolean execute() {
        System.out.println("Goodbye " + trainer.name + "! Hope to see you soon!");
        return false;
    }

    public boolean shouldExecute(String input) {
        return "exit".equals(input.toLowerCase());
    }
}
