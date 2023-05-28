package Homework3;

public class carPerson {
    public static void main(String[] args) {
        Car sportsCar = new Car();
        sportsCar.year = 2023;
        sportsCar.price = 100000;
        sportsCar.fuelTankCapacity = 60.0;
        sportsCar.freeFuel = 60.0;
        sportsCar.engineFuelOperationSystem = "System for sport car";
        sportsCar.isSportCar = true;

        Car familyCar = new Car();
        familyCar.year = 2022;
        familyCar.price = 50000;
        familyCar.fuelTankCapacity = 50.0;
        familyCar.freeFuel = 50.0;
        familyCar.engineFuelOperationSystem = "System for family car";
        familyCar.isSportCar = false;

        sportsCar.useFuel(35);
        familyCar.changeЕngineFuelOperationSystem("Changed System");

        System.out.println("Fields for sports car: ");
        System.out.println("Year: " + sportsCar.year);
        System.out.println("Price: " + sportsCar.price);
        System.out.println("Is sport car: " + sportsCar.isSportCar);
        System.out.println("Fuel tank capacity: " + sportsCar.fuelTankCapacity);
        System.out.println("Free fuel: " + sportsCar.freeFuel);
        System.out.println("Engine fuel operating system: " + sportsCar.engineFuelOperationSystem);

        System.out.println("---------------------------------------------------------");

        System.out.println("Fields for family car: ");
        System.out.println("Year: " + familyCar.year);
        System.out.println("Price: " + familyCar.price);
        System.out.println("Is sport car: " + familyCar.isSportCar);
        System.out.println("Fuel tank capacity: " + familyCar.fuelTankCapacity);
        System.out.println("Free fuel: " + familyCar.freeFuel);
        System.out.println("Engine fuel operating system: " + familyCar.engineFuelOperationSystem);


    }

}
