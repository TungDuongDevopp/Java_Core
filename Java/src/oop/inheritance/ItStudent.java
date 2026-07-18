package oop.inheritance;

public class ItStudent extends Student {
    private String language;


    public ItStudent(String language,String id, String name, double price, double tax) {
        super(id, name, price, tax);
        this.language = language;
    }

    @Override
    public String toString() {
        return "ItStudent{" +
                "language='" + language + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
