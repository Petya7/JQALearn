package Homework4;

public class Computer {
    int year;
    double price;
    String operationSystem;

    public Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    int comparePrice(Computer compare) {
        if(this.price > compare.price) {
            return -1;
        } else if(this.price < compare.price) {
            return 1;
        } else {
            return 0;
        }
    }
}

    class ComputerPrices {
    public static void main(String[] args) {
        Computer comp1 = new Computer(2023,5000.00, "Windows");
        Computer comp2 = new Computer(2022, 4000.00, "Linux");
    }
}
