package labs;
import utils.validator.ValidationInput;
import utils.validator.*;
import utils.helpers.ShowResult;
public class Lab7 {
    public static void main(String[] args) {
        boolean isRunning = false;
        menuLoop:while (true){
            System.out.println();
            System.out.println("""
    +-----------------------------------------+
    | Mời bạn chọn chức năng:                 |
    +-----------------------------------------+
    | 1. Check CCCD                           |
    | 2. Check Email                          |
    | 3. Check Phone                          | 
    | 4. Check Password                       |
    | 5. Thoát                                |
    +-----------------------------------------+
    """);
            int choice = ValidationInput.getValidInt("Mời bạn nhập số: ",1,5);
            switch (choice){
                case 1:
                    String identity = ValidationInput.getValidString("Mời nhập CCCD: ");
                    ShowResult.showResult(IndentityValidator.isValidIdentity(identity),"CCCD");
                    break;
                case 2:
                    String email = ValidationInput.getValidString("Mời nhập Email: ");
                    ShowResult.showResult(EmailValidator.isValidEmail(email),"Email");
                    break;
                case 3:
                    String phone = ValidationInput.getValidString("Mời nhập SDT: ");
                    ShowResult.showResult(PhoneValidator.isValidPhone(phone),"SDT");
                    break;
                case 4:
                    String password= ValidationInput.getValidString("Mời nhập password: ");
                    ShowResult.showResult(PasswordValidator.isValidPassWord(password),"password");
                    break;
                case 5:
                    System.out.println("Bạn đã thoát chương trình!");
                    break menuLoop;
            }
        }
        System.out.println("Cảm ơn đã sử dụng chương trình");
    }
}
