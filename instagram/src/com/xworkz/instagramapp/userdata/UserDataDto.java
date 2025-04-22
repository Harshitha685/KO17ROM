package com.xworkz.instagramapp.userdata;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDataDto
{
    private String email;
    private String dob;
    private String password;
    private String name;
    private String userName;

//    public UserDataDto()
//    {
//
//    }
//    public void setEmail(String email)
//    {
//        this.email=email;
//    }
//    public String getEmail()
//    {
//        return email;
//    }
//    public void setDob(String dob)
//    {
//        this.dob=dob;
//    }
//    public String getDob()
//    {
//        return dob;
//    }
//    public void setPassword(String password)
//    {
//        this.password=password;
//    }
//    public String getPassword()
//    {
//        return password;
//    }
//    public void setName(String name)
//    {
//        this.name=name;
//    }
//    public String getName()
//    {
//        return name;
//    }
//    public void setUserName(String userName)
//    {
//        this.userName=userName;
//    }
//    public String getUserName()
//    {
//        return userName;
//    }

    @Override
    public String toString(){
        return "UserDataDto-{email - "+this.email+"," +
                "\ndob - "+this.dob+"," +
                "\npassword - "+this.password+"," +
                "\nname - "+this.name+"," +
                "\nuser name - "+this.userName+" }";
    }
}
