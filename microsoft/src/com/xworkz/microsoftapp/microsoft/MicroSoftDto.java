package com.xworkz.microsoftapp.microsoft;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MicroSoftDto {
        private String userId;
        private String name;
        private String email;
        private String password;
        private String confirmPassword;
        private long mobileNumber;

        // Setters
//        public void setUserId(String userId) {
//            this.userId = userId;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public void setEmail(String email) {
//            this.email = email;
//        }
//
//        public void setPassword(String password) {
//            this.password = password;
//        }
//
//        public void setConfirmPassword(String confirmPassword) {
//            this.confirmPassword = confirmPassword;
//        }
//
//        public void setMobileNumber(long mobileNumber) {
//            this.mobileNumber = mobileNumber;
//        }
//
//        // Getters
//        public String getUserId() {
//            return userId;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public String getEmail() {
//            return email;
//        }
//
//        public String getPassword() {
//            return password;
//        }
//
//        public String getConfirmPassword() {
//            return confirmPassword;
//        }
//
//        public long getMobileNumber() {
//            return mobileNumber;
//        }

        @Override
        public String toString(){
                return "MicroSoftDto=[userid = "+this.userId+"," +"\nname = "+this.name+"," +"\nemail = "+this.email+"," +"\npassword = "+this.password+"," +"\nconfirm password = "+this.confirmPassword+","+"\nmobile number = "+this.mobileNumber+"]";
        }
    }


