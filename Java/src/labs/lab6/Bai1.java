package labs.lab6;

import utils.validator.ValidationInput;

public class Bai1 {
    public static void main(String[] args) {
            int count = 5;
            boolean loginSuccess = true;
            while (count>0){
                String username = ValidationInput.getValidString( "\nMời bạn nhập username: ");
                String password = ValidationInput.getValidString("Mời bạn nhập password: ");

                // Kiểm tra thông tin (Giả sử mật khẩu đúng là "12345678")
                if (username.equals("hoidanit") && password.equals("12345678")) {
                    loginSuccess = true;
                    break; // Đúng rồi thì thoát vòng lặp ngay lập tức
                }

                // Nếu sai: Trừ lượt và thông báo
                count--;
                if (count > 0) {
                    System.out.format("Thông tin không hợp lệ, bạn còn %d lần nhập!\n", count);
                }
            }
        if (loginSuccess) {
            System.out.println("\nBạn đã đăng nhập thành công!");
        } else {
            System.out.println("\nTài khoản bị khóa, vui lòng liên hệ admin!");
        }

    }
}
