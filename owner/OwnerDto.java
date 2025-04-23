package com.xworkz.objectmethodtask.owner;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OwnerDto {

    private String ownerName;
    private String contactNumber;
    private String emailAddress;
    private String address;
    private boolean isBusinessOwner;

    @Override
    public String toString() {
        return "OwnerDto = (" +
                "ownerName = " + this.ownerName + "," +
                "\ncontactNumber = " + this.contactNumber + "," +
                "\nemailAddress = " + this.emailAddress + "," +
                "\naddress = " + this.address + "," +
                "\nisBusinessOwner = " + this.isBusinessOwner + ")";
    }
}


