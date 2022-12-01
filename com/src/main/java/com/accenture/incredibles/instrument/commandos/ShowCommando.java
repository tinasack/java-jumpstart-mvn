package com.accenture.incredibles.instrument.commandos;

import com.accenture.incredibles.instrument.database.Connector;
import com.accenture.incredibles.instrument.models.Instrument;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ShowCommando implements Commando {

    private Connection connection;

    public ShowCommando(Connection connection) {
        this.connection = connection;
    }
    public boolean execute() throws SQLException {
        ArrayList<Instrument> instruments = new ArrayList<>();

        String sql = "select * from instruments";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        // Zeile für Zeile
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String art = resultSet.getString("art");

            Instrument instrument = new Instrument(name, art);
            instruments.add(instrument);
        }

        for (Instrument instrument : instruments) {
            instrument.printInfo();
        }
        return true;
    }

    public boolean run(String command) {
        return  "show".equals(command);
    }
}
