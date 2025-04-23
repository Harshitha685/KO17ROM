package com.xworkz.objectmethodtask.owner;

public class OwnerRunner {
        public static void main(String[] args) {

            OwnerDto owner = new OwnerDto();

            owner.setOwnerName("John Doe");
            owner.setContactNumber("+1-123-456-7890");
            owner.setEmailAddress("john.doe@example.com");
            owner.setAddress("1234 Elm Street, Springfield, USA");
            owner.setBusinessOwner(true);

            System.out.println(owner);
        }
    }


