package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ngoại lệ là những thứ có thể xảy ra khiến chương trình chạy theo hướng không mong muốn
        // Xử lý ngoại lệ là cách chúng ta dự đoan trước khả năng xảy ra và đưa ra hướng giải quyết
        // Điều đấy giúp cho chương trình không dừng lại một cách đột ngột và có thể chạy những dòng lệnh tiếp theo
        // throw thực tế là ném ra lỗi ngay khi gặp ngoại le. Nó chỉ khác không throw là việc mình biết trước ngoại lệ và không biết trước ngoại lệ
        ATM atm = new ATM();

        try {
            atm.withdraw(1000000);
            System.out.println("Màn hình: Giao dịch thành công.");
        } catch (Exception e) {
            System.out.println("Màn hình: " + e.getMessage());
        }

    }
}
