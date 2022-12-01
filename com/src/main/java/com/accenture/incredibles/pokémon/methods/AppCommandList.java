package com.accenture.incredibles.pokémon.methods;

import com.accenture.incredibles.pokémon.commands.ExitPokémonCommands;
import com.accenture.incredibles.pokémon.commands.LevelPokémonCommands;
import com.accenture.incredibles.pokémon.commands.PokédexPokémonCommands;
import com.accenture.incredibles.pokémon.commands.PokémonCommands;
import com.accenture.incredibles.pokémon.models.pokédex.Pokèdex;
import com.accenture.incredibles.pokémon.models.Trainer;

import java.util.ArrayList;
import java.util.List;

public class AppCommandList {
    public List<PokémonCommands> createList(Trainer trainer, Pokèdex pokèdex) {
        List<PokémonCommands> commands = new ArrayList<>();
        commands.add(new ExitPokémonCommands(trainer));
        commands.add(new PokédexPokémonCommands(pokèdex));
        commands.add(new LevelPokémonCommands(trainer));
        return commands;
    }
}
