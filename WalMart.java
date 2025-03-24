class WalMart {

    public static String userLogIn(String emailId, String firstName, String lastName, String phoneNumber, String passWord) {
        String var = null;

        
        boolean vaaa = customerProfileValidation(emailId, firstName, lastName, phoneNumber, passWord);

        if (vaaa == true) {  
            System.out.println("Sign-in successful");
        } else {
            System.out.println("Sign-in unsuccessful");
        }

        return var;
    }

    public static boolean customerProfileValidation(String emailId, String firstName, String lastName, String phoneNumber, String passWord) {
        boolean customerValid = false;
        boolean isemailId = false;
        boolean isfirstName = false;
        boolean islastName = false;
        boolean isphoneNumber = false;
        boolean ispassWord = false;

        // Email ID validation
        if (emailId != null && !emailId.isEmpty()) {
            isemailId = true;
        } else {
            System.out.println("Inappropriate emailId");
        }

        // First Name validation
        if (firstName != null && !firstName.isEmpty() && firstName.length() > 4) {
            isfirstName = true;
        } else {
            System.out.println("First name is not valid");
        }

        // Last Name validation 
        if (lastName != null && !lastName.isEmpty() && lastName.length() <= 2) {
            System.out.println("Invalid last name...");
        } else {
            islastName = true;
        }

        // Phone Number validation
        if (phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() == 10) {
            isphoneNumber = true;
        } else {
            System.out.println("Please provide a proper phone number");
        }

        // Password validation 
        if (passWord != null &&  !passWord.isEmpty() && passWord.length() > 4 && passWord.length() < 10) {
            ispassWord = true;
        } else {
            System.out.println("Please enter a correct password");
        }

        // Final Validation
        if (isemailId == true && isfirstName == true && islastName == true && isphoneNumber == true && ispassWord == true) {
            customerValid = true;
        }

        return customerValid;  
    }

}
