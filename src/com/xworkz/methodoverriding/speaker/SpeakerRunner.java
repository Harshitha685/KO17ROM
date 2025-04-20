package com.xworkz.methodoverriding.speaker;

public class SpeakerRunner {
        public static void main(String[] args) {
            Speaker speaker = new Speaker();
            speaker.powerOn();
            speaker.increaseVolume();
            speaker.decreaseVolume();
            speaker.powerOff();
            System.out.println();

            Speaker bs = new BluetoothSpeaker();
            bs.powerOn();
            bs.increaseVolume();
            bs.decreaseVolume();
            bs.powerOff();
            System.out.println();

            BluetoothSpeaker btSpeaker = new BluetoothSpeaker();
            btSpeaker.powerOn();
            btSpeaker.increaseVolume();
            btSpeaker.decreaseVolume();
            btSpeaker.powerOff();
            btSpeaker.connectToBluetooth();  // Unique method
        }
    }


