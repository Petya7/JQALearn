package Homework6;

public class Cat extends Animal implements IAnimal {
    public void climb() {
        System.out.println("The cat is climbing");
    }

    @Override
    void play() {
        System.out.println("The cat is playing");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("The cat is making noises like meow");
    }
}
