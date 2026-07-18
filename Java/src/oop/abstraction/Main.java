package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Miu");
        Dog dog = new Dog("Lu");
        cat.sound();
        cat.sleep();
        dog.sound();
        dog.sleep();
    }
}
