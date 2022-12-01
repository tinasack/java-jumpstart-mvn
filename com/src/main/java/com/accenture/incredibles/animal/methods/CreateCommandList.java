package com.accenture.incredibles.animal.methods;

import com.accenture.incredibles.animal.command.*;
import com.accenture.incredibles.animal.models.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateCommandList {
    public List<Command> createCommandList(List<Animal> animals, Scanner input) {
        List<Command> commands = new ArrayList<>();
        commands.add(new AddCommand(animals, input));
        commands.add(new ShowCommand(animals));
        commands.add(new SoundCommand(animals));
        commands.add(new ExitCommand());
        return commands;
    }
}
