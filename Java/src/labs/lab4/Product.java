package labs.lab4;
import utils.validator.ValidationInput;

public class Product {

    private String name;
    private double price;
    private double tax;
    private double discount;
    private Category category;
    public Product(String name,double price,double tax,double discount,Category category){
        setName(name);
        setPrice(price);
        setTax(tax);
        setDiscount(discount);
        this.category = category;
    }
    public Product(){}


    public void setTax(double tax) {

        if(!ValidationInput.isValidDouble(tax,0,100,false)){
            throw new IllegalArgumentException("Thuế phải nằm trong khoảng 0-100%");
        }
        this.tax = tax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(!ValidationInput.isValidDouble(price,0,10000000000f,false)){
            throw new IllegalArgumentException("Tiền phải nằm trong khoảng 0-10 tỷ");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!ValidationInput.isValidString(name)){
            throw new IllegalArgumentException("Tên sản phẩm không được bỏ trống");
        }
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if(!ValidationInput.isValidDouble(discount,0,100,false)){
            throw new IllegalArgumentException("Giảm giá phải nằm trong khoảng 0-100%");
        }
        this.discount = discount;
    }

    public double getTax(){
        return getDiscountedPrice() * this.tax / 100;
    }
    public double getTotal() {
        return getDiscountedPrice() + getTax();
    }
    public double getDiscountedPrice() {
        return this.price * (1 - this.discount / 100);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        String cateName = (category != null) ? category.getCategoryName() : "Không có";
        return String.format("Product [ Danh mục: %s|Name: %s| Price: %.1f| Tax: %.1f%%| Discount: %.1f%%| Total: %.1f]",
               this.category,this.name, this.price, this.tax,this.discount,getTotal());
    }
}
