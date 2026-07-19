package utils.validator;

import java.util.regex.Pattern;
import utils.constant.RegexConstant;
public class PhoneValidator {
    public static boolean isValidPhone(String input){
        return ValidationInput.isValidString(input) && Pattern.matches(RegexConstant.PHONE,input);
    }
}
