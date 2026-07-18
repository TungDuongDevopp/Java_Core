package utils.Validator;

import java.util.regex.Pattern;

public class PasswordValidator {
    private static final String regExPassWord ="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{6,}$";

    public static boolean isValidPassWord(String input){
        return Pattern.matches(regExPassWord,input);
    }
}
