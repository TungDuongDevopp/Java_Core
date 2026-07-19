package utils.validator;
import utils.constant.RegexConstant;
import java.util.regex.Pattern;

public class IndentityValidator {
    public static boolean isValidIdentity(String input){
        return ValidationInput.isValidString(input) && Pattern.matches(RegexConstant.CCCD,input);
    }
}
