package com.accenture.incredibles.instrument.models;

import java.util.Objects;

public class Instrument {

    public String name;
    public String art;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    public Instrument(String name, String art) {
        this.name = name;
        this.art = art;

    }
    // method for printing information
    public void printInfo() {
        System.out.println(name + ", " + art);
    }
}
