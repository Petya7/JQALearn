package Homework3;

public class Car {
    int year;
    int price;
    boolean isSportCar;
    double fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;


    public void changeЕngineFuelOperationSystem(String newЕngineFuelOperationSystem) {
        engineFuelOperationSystem = newЕngineFuelOperationSystem;
    }

    public void useFuel(double fuel) {
        if(fuel <= freeFuel) {
            freeFuel -= fuel;
        } else {
            System.out.println("Not enough fuel");
        }

    }
}


