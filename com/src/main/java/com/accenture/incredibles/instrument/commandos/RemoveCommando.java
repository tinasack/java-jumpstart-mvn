package com.accenture.incredibles.instrument.commandos;

import com.accenture.incredibles.instrument.models.Instrument;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveCommando implements Commando {
    private Connection connection;
    private Scanner scanner;

    public RemoveCommando(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }
    public boolean execute() throws SQLException {
        System.out.println("Which instrument do you want to remove?");
        System.out.print(">> ");
        String inputName = scanner.nextLine();

        //mySQL delete statemnet
        String deleteStmt = "delete from instruments where name = ?";
        //crete PreparedStatement
        PreparedStatement preparedStmt = connection.prepareStatement(deleteStmt);
        preparedStmt.setString(1, inputName);

        preparedStmt.execute();

        System.out.println("Instrument was removed!");


        return true;
    }

    public boolean run(String command) {
        return "remove".equals(command);
    }
}
