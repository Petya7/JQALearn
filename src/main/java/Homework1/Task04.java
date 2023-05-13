package Homework1;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner schedule = new Scanner(System.in);

        System.out.println("Enter number of working hours: ");
        int workingHours = schedule.nextInt();

        System.out.println("Enter amount of money: ");
        float money = schedule.nextFloat();

        System.out.println("Is it a holiday? ");
        boolean isHoliday = schedule.nextBoolean();

        if(!isHoliday){
            System.out.println("I will work.");
        } else if(money >= 10) {
            System.out.println("I will go to the movies.");
        } else if(money < 10 && money > 0) {
            System.out.println("I will go for ice cream.");
        } else {
            System.out.println("I will stay home and watch TV.");
        }

    }
}
