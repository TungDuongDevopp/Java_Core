package oop.abstraction;

public class Bird implements IAnimal{
    @Override
    public void sound() {
        System.out.println("chip chip");
    }

    @Override
    public void run() {
        System.out.println("Fly");
    }

    @Override
    public void sleep() {
        System.out.println("The bird is sleeping");
    }
}
