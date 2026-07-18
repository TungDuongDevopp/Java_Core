package oop.polymorphism;

import java.text.DecimalFormat;

public class DirectBanking extends PaymentMethod {
    private static final DecimalFormat formatter = new DecimalFormat("#,###");

    @Override
    void payment(double money) {
        String bieuDienTien = formatter.format(money);
        System.out.println("Đã chuyển khoản ngân hàng số tiền: " + bieuDienTien + " VND.");

    }
}
