package com.accenture.incredibles.pokémon.commands;

import com.accenture.incredibles.pokémon.models.Trainer;

public class LevelPokémonCommands implements PokémonCommands {
    private Trainer trainer;

    public LevelPokémonCommands(Trainer trainer) {
        this.trainer = trainer;
    }

    public boolean execute() {
        System.out.println("You are on level " + trainer.level);
        return true;
    }

    public boolean shouldExecute(String input) {
        return "level".equals(input.toLowerCase());
    }
}
