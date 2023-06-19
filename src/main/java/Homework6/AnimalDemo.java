package Homework6;

public class AnimalDemo {



    public static void main(String[] args) {
    Bird bird = new Bird();
    bird.fly();
    bird.play();
    bird.sing();
    bird.sing("Song 1");
    bird.makeSomeNoise();
    System.out.println("--------------------");

    Cat cat = new Cat();
    cat.climb();
    cat.play();
    cat.makeSomeNoise();
    System.out.println("--------------------");

    Dog dog = new Dog();
    dog.bringStick();
    dog.play();
    dog.makeSomeNoise();

    }
}
