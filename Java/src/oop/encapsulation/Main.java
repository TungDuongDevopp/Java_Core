package oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        Student st2 = new Student("1","Dương",22);
        System.out.println("Name: "+ st2.getName());
        System.out.println(st2);

    }
}
