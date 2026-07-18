package oop.abstraction;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + "meow meo meo");
    }
}
