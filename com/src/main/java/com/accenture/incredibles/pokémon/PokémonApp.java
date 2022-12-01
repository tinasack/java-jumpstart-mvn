package com.accenture.incredibles.pokémon;

import com.accenture.incredibles.pokémon.commands.PokémonCommands;
import com.accenture.incredibles.pokémon.methods.AppCommandList;
import com.accenture.incredibles.pokémon.methods.ErrorMessage;
import com.accenture.incredibles.pokémon.methods.GetInput;
import com.accenture.incredibles.pokémon.models.pokédex.Pokèdex;
import com.accenture.incredibles.pokémon.models.Trainer;

import java.util.List;
import java.util.Scanner;

public class PokémonApp {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        Pokèdex pokèdex = new Pokèdex();
        Scanner scanner = new Scanner(System.in);
        GetInput getInput = new GetInput();
        ErrorMessage errorMessage = new ErrorMessage();

        AppCommandList appCommandList = new AppCommandList();
        List<PokémonCommands> appCommands = appCommandList.createList(trainer, pokèdex);


        // start App
        System.out.println("Hello and welcome! Please provide your 'Trainer-Name' to start!");
        System.out.print("Trainer-Name: ");
        trainer.name = scanner.nextLine();

        System.out.println("Great! Hi " + trainer.name + ", if you want to use your Pokédex type 'pokedex' " +
                "if you want to see your Level type 'level'. " +
                "You can leave anytime by using 'exit'!");

        boolean run = true;
        while (run) {
            String userCommand = getInput.execute();

            boolean commandFound = false;
            for (PokémonCommands appCommand : appCommands) {
                if (appCommand.shouldExecute(userCommand)) {
                    commandFound = true;
                    run = appCommand.execute();
                    break;
                }
            }

            if (!commandFound) {
                errorMessage.execute();
            }
        }
    }
}
