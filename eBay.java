class eBay {
    
    public static String register(String firstName, String lastName, String email, String passWord) {
        String ref = null;

        boolean isValid = validateUserRegister(firstName, lastName, email, passWord);

        if (isValid == true) {
            System.out.println("Registration successful");
			ref = "Success";
        } else {
            System.out.println("Registration unsuccessful");
			ref = "Unsuccess";
        }

        return ref;  
    }

   
    public static boolean validateUserRegister(String firstName, String lastName, String email, String passWord) {
        boolean validUser = false;
        boolean isFirstName = false;
        boolean isLastName = false;
        boolean isEmail = false;
        boolean isPassWord = false;

        // First Name Validation
        if (firstName != null && !firstName.isEmpty() && firstName.length() > 3) {
            isFirstName = true;
        } else {
            System.out.println("Please give the proper firstName");
        }

        // Last Name Validation
        if (lastName != null && !lastName.isEmpty() && lastName.length() > 1) {
            isLastName = true;
        } else {
            System.out.println("Invalid lastName");
        }

        // Email Validation
        if (email != null && !email.isEmpty()) {
            isEmail = true;
        } else {
            System.out.println("Inappropriate email format");
        }

        // Password Validation
        if (passWord != null && !passWord.isEmpty() && passWord.length() >= 8) {
            isPassWord = true;
        } else {
            System.out.println("Invalid passWord (must be at least 8 characters)");
        }

        // Final validation check
        if (isFirstName && isLastName && isEmail && isPassWord) {
            validUser = true;
        }

        return validUser;
    }

    }