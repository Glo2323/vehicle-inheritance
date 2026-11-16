package com.pluralsight;

public class VehicleApp {


    public static void main(String[] args) {


        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println(slowRide.getFuelCapacity());
        slowRide.getFuel(10);
        System.out.println(slowRide.getFuelCapacity());




    }
}
