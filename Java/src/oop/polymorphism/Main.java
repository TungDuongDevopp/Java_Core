package oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        PaymentMethod  paymentMethod;
        paymentMethod = new CreditCard();

        paymentMethod.payment(15000000);
        paymentMethod = new DirectBanking();
        paymentMethod.payment(12000000);
        paymentMethod = new EWallet();
        paymentMethod.payment(10000000);
    }
}
