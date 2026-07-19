package exceptions;

public class Bank {

    public void withdraw(int money) throws Exception {
        int balance = 500000;

        if (money > balance) {
            throw new Exception("Không đủ số dư!");
        }

        System.out.println("Ngân hàng: Đã trừ tiền thành công.");
    }
}
