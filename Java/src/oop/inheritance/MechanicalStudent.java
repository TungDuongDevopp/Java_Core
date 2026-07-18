package oop.inheritance;

public class MechanicalStudent extends Student {
    private String skill;


    public MechanicalStudent(String skill,String id, String name, double price, double tax) {
        super(id, name, price, tax);
        this.skill  = skill;
    }

    @Override
    public String toString() {
        return "MechanicalStudent{" +
                "skill='" + skill + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
