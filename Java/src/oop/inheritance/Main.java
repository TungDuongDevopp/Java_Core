package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        ItStudent it = new ItStudent("Java","123","Dương",1500000,0.05);
        System.out.println(it);
        MechanicalStudent ms = new MechanicalStudent("Mechanic","123","Dương",1500000,0.05);
        System.out.println(ms);
    }
}
