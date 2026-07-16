package Lab4;

public class Product {

    private String name;
    private double price;
    private double tax;
    private double discount;

    public Product(String name,double price,double tax,double discount){
        setName(name);
        setPrice(price);
        setTax(tax);
        setDiscount(discount);
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


    @Override
    public String toString() {
        return String.format("Product [Name: %s, Price: %.1f, Tax: %.1f%%, Discount: %.1f%%, Total: %.1f]",
                this.name, this.price, this.tax,this.discount,getPriceIncludingTax());
    }
}
