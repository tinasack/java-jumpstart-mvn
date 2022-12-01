package com.accenture.incredibles.instrument.methods;

import com.accenture.incredibles.instrument.models.Instrument;
import com.accenture.incredibles.instrument.models.NewInstrument;

import java.util.ArrayList;

public class CreateInstruments {
    public void execute(ArrayList<Instrument> instruments) {
        NewInstrument newInstrument = new NewInstrument();
        newInstrument.klavier(instruments);
        newInstrument.ukulele(instruments);
        newInstrument.ocarina(instruments);
        newInstrument.konzertGitarre(instruments);
        newInstrument.westernGitarre(instruments);
    }
}
