package exceptions;

public class ATM {


    private Bank bank = new Bank();

    public void withdraw(int money) throws Exception {
        System.out.println("ATM: Đang gửi yêu cầu tới ngân hàng...");
        bank.withdraw(money);
        System.out.println("ATM: Nhả tiền.");
    }

}