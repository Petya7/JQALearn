package Homework5;

public class Student extends Person {
    int score;
    public void setScore ( int score){
        if (score >= 2 && score <= 6) {
            this.score = score;
        } else {
            System.out.println("Enter score between 2 and 6");
        }
    }
    public double getScore() {
        return score;
    }

    public Student(String name, int age, boolean isMan, int newScore) {
        super(name, age, isMan);
        setScore(newScore);
    }

    public void showStudentInfo () {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("isMan:" + isMan);
        System.out.println("score:" + getScore());
    }
}