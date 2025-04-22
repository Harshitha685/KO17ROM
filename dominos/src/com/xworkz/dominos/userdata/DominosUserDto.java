package com.xworkz.dominos.userdata;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DominosUserDto
{

        private String email;
        private String phoneNumber;
        private String password;
        private String fullName;
        private String deliveryAddress;

        public DominosUserDto() {
        }

//        public void setEmail(String email) {
//            this.email = email;
//        }
//
//        public String getEmail() {
//            return email;
//        }
//
//        public void setPhoneNumber(String phoneNumber) {
//            this.phoneNumber = phoneNumber;
//        }
//
//        public String getPhoneNumber() {
//            return phoneNumber;
//        }
//
//        public void setPassword(String password) {
//            this.password = password;
//        }
//
//        public String getPassword() {
//            return password;
//        }
//
//        public void setFullName(String fullName) {
//            this.fullName = fullName;
//        }
//
//        public String getFullName() {
//            return fullName;
//        }
//
//        public void setDeliveryAddress(String deliveryAddress) {
//            this.deliveryAddress = deliveryAddress;
//        }
//
//        public String getDeliveryAddress() {
//            return deliveryAddress;
//        }

        @Override
        public String toString(){
                return "Dominos = (email = "+this.email+"," +
                        "\nphone no = "+this.phoneNumber+"," +
                        "\npassword = "+this.password+"," +
                        "\nfull name = "+this.fullName+"," +
                        "\ndelivery address = "+this.deliveryAddress+")";
        }
    }


