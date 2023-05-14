package Homework1;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args){
        Scanner days = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int dayNum = days.nextInt();

        String dayOfWeek = "";
        switch(dayNum) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
        }
        System.out.println("Day of the week is: " + dayOfWeek);
    }
}
