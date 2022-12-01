package com.accenture.incredibles.animal.methods;

import com.accenture.incredibles.animal.command.Command;
import com.accenture.incredibles.animal.models.Animal;

import java.util.ArrayList;
import java.util.List;

public class App {

    public void execute() {
        List<Animal> animals = new ArrayList<>();

        GetInput getInput = new GetInput();
        Error error = new Error();

        CreateCommandList commandList = new CreateCommandList();
        List<Command> commands = commandList.createCommandList(animals, getInput.scanner);

        boolean run = true;
        while (run) {
            System.out.println("What do you want to do?");

            String input = getInput.execute();

            boolean commandFound = false;
            for (Command command : commands) {
                if (command.shouldExecute(input)) {
                    commandFound = true;
                    run = command.execute();
                    break;
                }
            }

            if (!commandFound) {
                error.execute();
            }
        }

    }
}
