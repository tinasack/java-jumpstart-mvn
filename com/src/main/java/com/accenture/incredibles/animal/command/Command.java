package com.accenture.incredibles.animal.command;

public interface Command {
    boolean execute();
    boolean shouldExecute(String input);
}
