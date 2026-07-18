package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        IAnimal bird = new Bird();
        IAnimal fish = new Fish();
        bird.run();
        bird.sound();
        bird.sleep();
        fish.run();
        fish.sound();
        fish.sleep();
    }
}
