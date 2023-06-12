package Homework5;

public class Person {

    String name;
    int age;
    boolean isMan;

    public Person(String newName, int newAge, boolean newIsMan) {
        this.name = newName;
        this.age = newAge;
        this.isMan = newIsMan;
    }


    public void showPersonInfo () {
        System.out.println ("name:" + name);
        System.out.println ("age:" + age);
        System.out.println ("isMan:" + isMan);
    }
}

