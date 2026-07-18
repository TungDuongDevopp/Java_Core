package oop.polymorphism;

import java.text.DecimalFormat;

public class EWallet  extends PaymentMethod{
    private static final DecimalFormat formatter = new DecimalFormat("#,###");
    @Override
    void payment(double money) {
        String bieuDienTien = formatter.format(money);
        System.out.println("Đã quét mã QR ví điện tử để trừ: " + bieuDienTien + " VND.");

    }
}
