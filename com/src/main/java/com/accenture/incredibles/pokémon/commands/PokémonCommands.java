package com.accenture.incredibles.pokémon.commands;

public interface PokémonCommands {
    boolean execute();
    boolean shouldExecute(String input);
}
