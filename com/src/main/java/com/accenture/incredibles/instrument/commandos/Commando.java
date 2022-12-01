package com.accenture.incredibles.instrument.commandos;

import java.sql.SQLException;

public interface Commando {
    boolean execute() throws SQLException;
    boolean run(String comand);
}
