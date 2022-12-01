package com.accenture.incredibles.instrument.commandos;
import com.accenture.incredibles.instrument.models.Instrument;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddCommando implements Commando {

    private Connection connection;
    private Scanner scanner;

    public AddCommando(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }
    public boolean execute() throws SQLException {
        System.out.println("Which instrument do you want to add?");
        System.out.print(">> ");
        String inputName = scanner.nextLine();
        System.out.println("What kind of instrument is it?");
        System.out.print(">> ");
        String inputArt = scanner.nextLine();

        //mySQL insert statemnet
        String insertStmt = "insert into instruments (name, art) values (?,?)";
        //crete PreparedStatement
        PreparedStatement preparedStmt = connection.prepareStatement(insertStmt);
        preparedStmt.setString(1, inputName);
        preparedStmt.setString(2, inputArt);

        boolean saved = false;
        if (!preparedStmt.execute()) {
            saved = true;
        }

        if (saved) {
            System.out.println("Instrument saved!");
        } else {
            System.out.println("Ooooops something went wrong! Please try again.");
        }

        return true;
    }

    public boolean run(String command) {
        return  "add".equals(command);
    }
}
