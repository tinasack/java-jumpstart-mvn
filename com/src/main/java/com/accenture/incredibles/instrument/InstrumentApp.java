package com.accenture.incredibles.instrument;

import com.accenture.incredibles.instrument.methods.Run;

import java.sql.SQLException;

public class InstrumentApp {
    public static void main(String[] args) throws SQLException {
        // create method to run app
        Run run = new Run();
        // intro to app
        System.out.println("Hi, welcome to your instrument list!");
        System.out.println("Please type 'show' to show your current list, 'add' to add instrument," +
                " 'remove' to remove instrument from list and 'exit' if you want to leave!");
        // run app
        run.execute();
    }
}