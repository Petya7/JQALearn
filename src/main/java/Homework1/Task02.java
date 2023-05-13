package Homework1;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter first number(int): ");
        int num1 = number.nextInt();

        System.out.println("Enter second number(double): ");
        double num2 = number.nextDouble();

        System.out.println("Enter third number(int): ");
        int num3 = number.nextInt();

        System.out.println("Enter fourth number(double): ");
        double num4 = number.nextDouble();

        int temp1 = num1;
        num1 = (int) num2;
        num2 = temp1;

        double temp2 = num3;
        num3 = (int) num4;
        num4 = temp2;
        System.out.println("New values:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        double sum1 = (double) (num1 + num2);
        System.out.println(" SUm of num1 and num2 after casting to double: " + sum1);
        int sum2 = (int) (num3 + num4);
        System.out.println(" SUm of num3 and num4 after casting to integer: " + sum2);

    }
}
