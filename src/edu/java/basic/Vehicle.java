package edu.java.basic;

public class Vehicle implements VehicleOperations {

    int noOfWheels;
    int noOfSeats;
    String color;
    String fuelType;
    String name;
    String regNumber;

    boolean engineRunning = false;
    int speed = 0;

    @Override
    public void start() {
        engineRunning = true;
        System.out.println("Started. Engine is running");;
    }

    @Override
    public void stop() {
        this.engineRunning = false;
        System.out.println("Stopped. Engine is off");;
    }

    @Override
    public void accelerate() {
        this.speed++;
        System.out.println("Now speed is " + this.speed);
    }

    @Override
    public void brake() {
        this.speed--;
        System.out.println("Now speed is " + this.speed);
    }

    @Override
    public void lightOn() {

    }

    @Override
    public void lightOff() {

    }

    @Override
    public void shiftGear(int gear) {

    }

    @Override
    public void openFuelTank() {

    }

    @Override
    public void closeFuelTank() {

    }

}
