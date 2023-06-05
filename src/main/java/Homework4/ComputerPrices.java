package Homework4;

public class ComputerPrices {
    public static void main(String[] args) {
        Computer comp1 = new Computer(2023,5000.00, "Windows");
        Computer comp2 = new Computer();
        comp2.year = 2022;
        comp2.price = 4000.00;
        comp2.operationSystem = "Linux";

        int result =  comp1.comparePrice(comp2);

        if(result == 1) {
           System.out.println("The price of comp2 is bigger than comp1");
        } else if(result == -1) {
            System.out.println("The price of comp1 is bigger than comp2");
        } else {
            System.out.println("Comp 1 and Comp2 have the same prices");
        }

    }

}