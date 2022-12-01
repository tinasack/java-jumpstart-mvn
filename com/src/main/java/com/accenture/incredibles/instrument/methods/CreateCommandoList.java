package com.accenture.incredibles.instrument.methods;

import com.accenture.incredibles.instrument.commandos.*;
import com.accenture.incredibles.instrument.models.Instrument;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateCommandoList {
    public ArrayList<Commando> createCommandoList(ArrayList<Instrument> instruments, Scanner scanner, Connection connection) {
        ArrayList<Commando> commandos = new ArrayList<>();
        commandos.add(new AddCommando(connection, scanner ));
        commandos.add(new ExitCommando());
        commandos.add(new ShowCommando(connection));
        commandos.add(new RemoveCommando(connection, scanner ));
        return commandos;
    }
}
