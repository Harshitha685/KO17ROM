package com.xworkz.twitterapp.twitter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@NoArgsConstructor
public class TwitterDto {

        private String handle;
        private String displayName;
        private String email;
        private String password;
        private String confirmPassword;
        private long mobileNumber;

//        // Setters
//        public void setHandle(String handle) {
//            this.handle = handle;
//        }
//
//        public void setDisplayName(String displayName) {
//            this.displayName = displayName;
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
//        public String getHandle() {
//            return handle;
//        }
//
//        public String getDisplayName() {
//            return displayName;
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
                return "TwitterDto:{handle="+this.handle+"," +
                        "\n display name="+this.displayName+"," +
                        "\n email="+this.email+"," +
                        "\n password="+this.password+"," +
                        "\n confirm password="+this.confirmPassword+"," +
                        "\n mobile number="+this.mobileNumber+"}";
        }
    }


