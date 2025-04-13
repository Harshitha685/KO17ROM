package com.xworkz.tasks.party;

public class PartyRunner {
    public static void main(String[] args) {
        Party party = new Party();
        party.startParty();
        party.endParty();

        BirthdayParty birthdayParty = new BirthdayParty();
        birthdayParty.startParty();
        birthdayParty.endParty();

        Party party1 = new BirthdayParty();

        BirthdayParty birthdayParty1 = (BirthdayParty) party1;
        System.out.println(birthdayParty1);
    }



}
