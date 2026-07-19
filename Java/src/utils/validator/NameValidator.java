package utils.validator;

public class NameValidator {
    public static boolean isValidName(String input){
      return  ValidationInput.isValidString(input) && input.matches("[\\p{L}\\s]+") ;
    }
}
