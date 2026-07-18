package oop.abstraction;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract void sound();

    public void sleep() {
        System.out.println(name + " is sleeping!");
    }
}
