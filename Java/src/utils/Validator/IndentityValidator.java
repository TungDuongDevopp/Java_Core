package utils.Validator;

import java.util.regex.Pattern;

public class IndentityValidator {
    private static final String regExIdentify = "^(00[1-9]|[1-8][0-9]|9[0-6])\\d{9}$";

    public static boolean isValidIdentity(String input){
        return Pattern.matches(regExIdentify,input);
    }
}
