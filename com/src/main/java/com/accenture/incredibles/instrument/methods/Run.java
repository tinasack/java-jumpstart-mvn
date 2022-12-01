package com.accenture.incredibles.instrument.methods;

import com.accenture.incredibles.instrument.database.Connector;
import com.accenture.incredibles.instrument.commandos.*;
import com.accenture.incredibles.instrument.models.Instrument;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public void execute() throws SQLException {
        Connector connector = new Connector();
        Connection connection = connector.getConnection();

        // create list of instruments and fill with existing data
        ArrayList<Instrument> instruments = new ArrayList<>();
        CreateInstruments createInstruments = new CreateInstruments();
        createInstruments.execute(instruments);
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // create list of commandos and fill with existing commandos
        CreateCommandoList commandoList = new CreateCommandoList();
        ArrayList<Commando> commandos = commandoList.createCommandoList(instruments, scanner, connection);
        // create errormessage
        Error error = new Error();

        // logic to run app
        boolean run = true;
        while (run) {
            System.out.print(">> ");
            String answer = scanner.nextLine();
            String input = answer.toLowerCase();

            boolean found = false;
            for (Commando commando : commandos) {
                if (commando.run(input)) {
                    run = commando.execute();
                    found = true;
                    break;
                }
            }

            if (!found) {
                error.error();
            }
        }
    }
}

