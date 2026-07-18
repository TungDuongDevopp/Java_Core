package utils.Validator;

import java.util.regex.Pattern;

public class EmailValidator {
    private static final String regExEmail= "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})$";

    public static boolean isValidEmail(String input){
        return Pattern.matches(regExEmail,input);
    }
}
