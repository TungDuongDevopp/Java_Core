package utils.validator;

import java.util.regex.Pattern;
import utils.constant.RegexConstant;
public class EmailValidator {
    public static boolean isValidEmail(String input){
        return Pattern.matches(RegexConstant.EMAIL,input);
    }
}
