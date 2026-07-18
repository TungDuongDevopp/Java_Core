package oop.abstraction;

public class Fish implements IAnimal{
    @Override
    public void sound() {
            System.out.println("pop pop");
    }

    @Override
    public void run() {
        System.out.println("Swim");
    }

    @Override
    public void sleep() {
            System.out.println("The fish is sleeping");
    }
}
