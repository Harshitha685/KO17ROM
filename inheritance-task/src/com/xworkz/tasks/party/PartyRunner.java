package com.xworkz.tasks.party;

public class PartyRunner {
    public static void main(String[] args) {
        Party party = new Party();
        party.partyType();
        party.location();
        party.time();
        party.numberOfGuests();
        party.dressCode();

        System.out.println("--------------------------");

        Party party2 = new BirthdayParty();
        party2.partyType();
        party2.location();
        party2.time();
        party2.numberOfGuests();
        party2.dressCode();

        System.out.println("--------------------------");

        BirthdayParty birthday = new BirthdayParty();
        birthday.birthdayPersonName();
        birthday.cakeFlavor();
        birthday.partyTheme();
        birthday.giftCategory();
        birthday.entertainment();

        System.out.println("--------------------------");

        Party party3 = new BirthdayParty();
        BirthdayParty birthday2 = (BirthdayParty) party3;
        System.out.println(birthday2);
    }
}
