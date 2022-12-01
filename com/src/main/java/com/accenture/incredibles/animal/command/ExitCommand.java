package com.accenture.incredibles.animal.command;

public class ExitCommand implements Command {

    public boolean execute() {
        System.out.println("Thanks for using this list. Hope to see you soon!");
        return false;
    }

    public boolean shouldExecute(String input) {
        return "exit".equals(input.toLowerCase());
    }
}
