package Homework1;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = number.nextInt();


        System.out.println("Enter second number: ");
        int num2 = number.nextInt();

        System.out.println("Enter third number: ");
        int num3 = number.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = num3;
        num3 = temp;

        System.out.println("Swaped values: ");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("Num3: " + num3);

        int sum = num1 + num2;
        int diff = sum - num3;
        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + diff);


        System.out.println("Values after calculations: ");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("Num3: " + num3);
        System.out.println("Sum " + sum);
        System.out.println("Diff " + diff);



    }
}
