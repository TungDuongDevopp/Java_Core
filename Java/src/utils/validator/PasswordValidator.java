package utils.validator;
import utils.constant.RegexConstant;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean isValidPassWord(String input){
        return  ValidationInput.isValidString(input) && Pattern.matches(RegexConstant.PASSWORD,input);
    }
}
