package Homework6;

public class Dog extends Animal implements IAnimal {
    public void bringStick() {
        System.out.println("The dog is bringing the stick");
    }

    @Override
    void play() {
        System.out.println("The dog is playing");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("The dog is making noises like baw");
    }
}
