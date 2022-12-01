package com.accenture.incredibles.instrument.commandos;

import com.accenture.incredibles.instrument.models.Instrument;

import java.util.ArrayList;
import java.util.Scanner;

public class ExitCommando implements Commando {

    public boolean execute() {
        System.out.println("Goodbye.");
        return false;
    }

    public boolean run(String command) {
        return  "exit".equals(command);
    }
}
