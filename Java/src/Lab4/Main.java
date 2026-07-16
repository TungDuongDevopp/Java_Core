package Lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Product product = new Product();
        String name;
        int discount;
        double price,tax;
        System.out.println("Mời nhập tên sản phẩm: ");
        name = sc.nextLine();
        System.out.println("Mời nhập giá sản phẩm: ");
        price = sc.nextDouble();
        System.out.println("Mời nhập thuế sản phẩm: ");
        tax = sc.nextDouble();
        System.out.println("Mời nhập  % giảm giá: ");
        discount = sc.nextInt();
        product.setName(name);
        product.setPrice(price);
        product.setTax(tax);
        product.setDiscount(discount);
        System.out.println(product);

    }
}
