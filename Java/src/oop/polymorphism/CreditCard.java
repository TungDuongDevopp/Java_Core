package oop.polymorphism;

import java.text.DecimalFormat;

public class CreditCard extends PaymentMethod{
    private static final DecimalFormat formatter = new DecimalFormat("#,###");

    @Override
    void payment(double money) {
        double total = money * 1.01;
        String bieuDienTien = formatter.format(money);
        System.out.println("Đã quẹt thẻ tín dụng (tính phí 1%): " + bieuDienTien + " VND.");
    }
}
