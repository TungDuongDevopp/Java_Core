import java.util.regex.Pattern;

public class Regular_Expression {
    public static void main(String[] args) {
        //RegEx là một chuỗi ký tự đặc biệt
        // Một số partern cơ bản
        /* [abc]: abc
           [^abc]: Not abc
           [0-9]: Số === \d >< \D: non digit
           [a-z]: Chữ cái thường, [A-Z]: Chữ hoa
           . : any character
           {m,n}: repeat trong khoảng m-n
           \w: any character & numeric ===[a-zA-z0-9_] >< \W not any character & numberic
           \s: space tab, endl, carriage return >< \S not ...
           *: zero or more repeat
           +: one or more repeat
           ? : one or zero
           ^...$: Start end
         */
        String phone = "0323456789";

        String regex = "^(03|05|07|09)\\d{8}$";

        boolean isValid = Pattern.matches(regex, phone);

        if (isValid) {
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
