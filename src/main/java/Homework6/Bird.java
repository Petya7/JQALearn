package Homework6;


public class Bird extends Animal implements IAnimal {
  public void fly() {
      System.out.println("The bird is flying");
  }
  public void sing() {
      System.out.println("The bird is singing");
  }
    public void sing(String song) {
        System.out.println("The bird is singing a song for bird1");
    }
    @Override
    void play() {
        System.out.println("The bird is playing");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("The bird is making noises like chik chirik");
    }
}
