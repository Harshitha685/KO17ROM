package com.xworkz.objectmethodtask.client;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDto {

    private String clientName;
    private String clientID;
    private String contactNumber;
    private String email;
    private String address;

    @Override
    public String toString() {
        return "ClientDto = (" +
                "clientName = " + this.clientName + "," +
                "\nclientID = " + this.clientID + "," +
                "\ncontactNumber = " + this.contactNumber + "," +
                "\nemail = " + this.email + "," +
                "\naddress = " + this.address + ")";
    }
}


