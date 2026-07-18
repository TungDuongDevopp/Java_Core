package oop.abstraction;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " bark woof woof");
    }
}
