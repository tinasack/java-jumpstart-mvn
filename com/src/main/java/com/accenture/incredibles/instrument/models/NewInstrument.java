package com.accenture.incredibles.instrument.models;

import java.util.ArrayList;

public class NewInstrument {
    String name;
    String art;
    public void konzertGitarre(ArrayList<Instrument> instrumentList) {
        name = "Konzertgitarre";
        art = "Saiteninstrument";
        Instrument konzertGitarre = new Instrument(name, art);
        instrumentList.add(konzertGitarre);
    }

    public void westernGitarre(ArrayList<Instrument> instrumentList) {
        name = "Westerngitarre";
        art = "Saiteninstrument";
        Instrument westernGitarre = new Instrument(name, art);
        instrumentList.add(westernGitarre);
    }

    public void ukulele(ArrayList<Instrument> instrumentList) {
        name = "Ukulele";
        art = "Saiteninstrument";
        Instrument ukulele = new Instrument(name, art);
        instrumentList.add(ukulele);
    }

    public void klavier(ArrayList<Instrument> instrumentList) {
        name = "Klavier";
        art = "Tasteninstrument";
        Instrument klavier = new Instrument(name, art);
        instrumentList.add(klavier);
    }

    public void ocarina(ArrayList<Instrument> instrumentList) {
        name = "Ocarina";
        art = "Holzblasinstrument";
        Instrument ocarina = new Instrument(name, art);
        instrumentList.add(ocarina);
    }
}
