package Homework1;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = number.nextInt();
        System.out.println("You entered: " + num1);

        System.out.println("Enter second number: ");
        int num2 = number.nextInt();
        System.out.println("You entered: " + num2);
        System.out.println("Enter third number: ");
        int num3 = number.nextInt();
        System.out.println("You entered: " + num3);
        if(num3 > num1 && num3 < num2) {
            System.out.println(num3 + " is between " + num1 + " and " + num2);
        } else {
            System.out.println(num3 + " is not between " + num1 + " and " + num2);
        }
    }

}
