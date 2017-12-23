package org.coursera.sustainableapps;

/**
 * Created by Amrish on 23-Dec-17.
 */

public class ValidationUtils {

    public static boolean isPasswordLengthValid(String password) {

        if (password.length() >= 8) {
            return true;
        }
        return false;
    }

    public static boolean isPasswordCharsValid(String password) {
        if (!"".equals(password.trim())) {
            return true;
        }
        return false;
    }

    public static boolean isEmailValid(String email) {

        //Email address has an @ sign
        if (!email.contains("@")) {
            return false;
        }
        //At least 1 character before the @ sign
        if (email.substring(0, email.indexOf("@")).isEmpty()) {
            return false;
        }

        String strAfter = email.substring(email.indexOf("@"), email.length());
        //At least 3 characters after "@" with "."
        if (strAfter.length() < 3 || strAfter.indexOf(".") == -1) {
            return false;
        }

        return true;
    }
}
