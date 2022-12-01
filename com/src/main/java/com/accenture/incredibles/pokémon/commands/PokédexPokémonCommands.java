package com.accenture.incredibles.pokémon.commands;

import com.accenture.incredibles.pokémon.models.pokédex.Pokèdex;

public class PokédexPokémonCommands implements PokémonCommands {

    private Pokèdex pokèdex;

    public PokédexPokémonCommands(Pokèdex pokèdex) {
        this.pokèdex = pokèdex;
    }

    public boolean execute() {
        pokèdex.execute();
        return true;
    }

    public boolean shouldExecute(String input) {
        return "pokedex".equals(input.toLowerCase());
    }
}
