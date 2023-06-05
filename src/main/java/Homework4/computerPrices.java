package Homework4;

public class computerPrices {
    public static void main(String[] args) {
        Computer comp1 = new Computer(2023,5000.00, "Windows");
        Computer comp2 = new Computer();
        comp2.year = 2022;
        comp2.price = 4000.00;
        comp2.operationSystem = "Linux";

       int result =  comp1.comparePrice(comp2);

    }
}
