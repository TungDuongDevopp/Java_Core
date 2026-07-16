package Lab4;

public class noTaxProduct extends Product {
    // Constructor con gọi lại Constructor cha thông qua super()
    public noTaxProduct(String name, double price, int discount,Category category) {
        super(name, price, 0,discount, category);
    }

    // Kế thừa và Ghi đè (Override) logic tính thuế: Sản phẩm này luôn có tiền thuế = 0
    @Override
    public double getTax() {
        return 0;
    }
}
