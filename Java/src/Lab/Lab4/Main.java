package Lab.Lab4;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo các danh mục trước
        Category dienTu = new Category("Điện tử");
        Category sach = new Category("Sách giáo khoa");

        // 2. Tạo sản phẩm thông thường (Có thuế 10%)
        Product laptop = new Product("Laptop Dell", 15000000, 10,4, dienTu);

        // 3. Tạo sản phẩm ĐƯỢC KẾ THỪA - Không tính thuế
        Product sachToan = new noTaxProduct("Sách Toán Lớp 10", 50000,15, sach);

        // In kết quả kiểm tra tính đa hình (Polymorphism)
        System.out.println(laptop);
        System.out.println(sachToan);

    }
}
