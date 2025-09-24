package Inheritance;

public class VehicleTransportSystem {
    int maxSpeed;
    String fuelType;
    VehicleTransportSystem(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void display() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }  
}
class Car extends VehicleTransportSystem {
    int numberOfDoors;
    Car(int maxSpeed, String fuelType, int numberOfDoors) {
        super(maxSpeed, fuelType);
        this.numberOfDoors = numberOfDoors;
    }
    void display() {
        super.display();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
class Truck extends VehicleTransportSystem {
    double loadCapacity;
    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    void display() {
        super.display();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
class Motorcycle extends VehicleTransportSystem {
    boolean hasSidecar;
    Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }
    void display() {
        super.display();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
class Main2 {
    public static void main(String[] args) {
        Car car = new Car(180, "Petrol", 4);
        car.display();
        System.out.println();
        Truck truck = new Truck(120, "Diesel", 15);
        truck.display();
        System.out.println();
        Motorcycle motorcycle = new Motorcycle(160, "Petrol", false);
        motorcycle.display();
    }
}
