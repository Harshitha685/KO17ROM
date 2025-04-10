package com.xworkz.tasks.instrument;

public class InstrumentRunner {

    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.name();
        instrument.displayInstrumentInfo();

        Microscope microscope = new Microscope();
        microscope.name();
        microscope.displayInstrumentInfo();
    }
}
