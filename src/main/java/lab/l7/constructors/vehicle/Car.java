package main.java.lab.l7.constructors.vehicle;

public class Car extends Vehicle {
    private final String brand;

    public Car(String regNo, String brand) {
        super(regNo);
        this.brand = brand;
    }
}
