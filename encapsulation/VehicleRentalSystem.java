package EncapsulationInterface;
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void printDetails(int days) {
        double rentalCost = calculateRentalCost(days);
        double insurance = (this instanceof Insurable) ? ((Insurable) this).calculateInsurance() : 0;
        System.out.println("Vehicle: " + type + " (" + vehicleNumber + ")");
        System.out.println("Rental Rate: " + rentalRate + " per day");
        System.out.println("Rental Cost for " + days + " days: " + rentalCost);
        System.out.println("Insurance: " + insurance);
        if (this instanceof Insurable) {
            System.out.println(((Insurable) this).getInsuranceDetails());
        }
       
    }
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + policyNumber;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9;
    }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.20;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + policyNumber;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR123", 2000, "CAR-INS-001"),
            new Bike("BIKE456", 500),
            new Truck("TRUCK789", 4000, "TRUCK-INS-002")
        };

        for (Vehicle v : vehicles) {
            v.printDetails(5);
        }
    }
}
