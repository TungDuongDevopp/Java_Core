package Lab4;

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
        this.tax = Validation.validateOrDefault(tax,0,100,false);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Validation.validateOrDefault(price,0,1000000000,false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Validation.validateStringOrDefault(name,"Chưa nhập");
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = Validation.validateOrDefault(discount,0,100,true);
    }

    public double getTax(){
        return getDiscountedPrice() * this.tax / 100;
    }
    public double getPriceIncludingTax() {
        return this.price + getTax();
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
               this.category,this.name, this.price, this.tax,this.discount,getPriceIncludingTax());
    }
}
