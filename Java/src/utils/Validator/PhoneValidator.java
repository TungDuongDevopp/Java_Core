package utils.Validator;

import java.util.regex.Pattern;

public class PhoneValidator {
    private static final String regExPhone = "^(03|05|07|09)\\d{8}$";

    public static boolean isValidPhone(String input){
        return Pattern.matches(regExPhone,input);
    }
}
