package com.xworkz.tasks.instrument;

public class InstrumentRunner {

    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.name();
        instrument.displayInstrumentInfo();
        instrument.powerOn();
        instrument.powerOff();
        instrument.calibrate();

        Instrument instrument2 = new Microscope();
        instrument2.name();
        instrument2.displayInstrumentInfo();
        instrument2.powerOn();
        instrument2.powerOff();
        instrument2.calibrate();

        Microscope microscope = new Microscope();
        microscope.startScan();
        microscope.stopScan();
        microscope.adjustFocus();
        microscope.adjustZoom();
        microscope.collectData();

        Instrument instrument1 = new Microscope();
        Microscope microscope1 = (Microscope) instrument1;
        System.out.println(microscope1);
    }
}
