package com.xworkz.tasks.instrument;

public class InstrumentRunner {

    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.name();
        instrument.displayInstrumentInfo();

        Microscope microscope = new Microscope();
        microscope.name();
        microscope.displayInstrumentInfo();

        Instrument instrument1 = new Microscope();
        Microscope microscope1 = (Microscope) instrument1;
        System.out.println(microscope1);
    }
}
