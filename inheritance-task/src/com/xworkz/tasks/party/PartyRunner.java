package com.xworkz.tasks.party;

public class PartyRunner {
    public static void main(String[] args) {
        Party party = new Party();
        party.startParty();
        party.endParty();

        BirthdayParty birthdayParty = new BirthdayParty();
        birthdayParty.startParty();
        birthdayParty.endParty();
    }



}
