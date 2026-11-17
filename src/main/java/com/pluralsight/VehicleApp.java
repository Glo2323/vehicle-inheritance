package com.pluralsight;

public class VehicleApp {


    public static void main(String[] args) {
        //?creating my moped
        Moped slowRide = new Moped();
        //*Setting my moped's attributes
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println(slowRide.getFuelCapacity());
        slowRide.getFuel(10);
        System.out.println(slowRide.getFuelCapacity());

        //?Creating a Car
        Car fastRide = new Car();
        fastRide.setColor("Black");
        fastRide.setMake("Honda");
        fastRide.setModel("Civic Type R");
        fastRide.setYear(1999);
        System.out.println("The " + fastRide.getYear() + " " + fastRide.getMake() + " " + fastRide.getModel() +  " is " + fastRide.getColor());





    }
}
