/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalmanagement;

/**
 * Abstract superclass for every vehicle offered by the
 * Dina and Gat Rent A Ride Service.
 *
 * It holds the common attributes of all vehicles and declares the
 * abstract method calculateRentalFee(), which every subclass must override
 * because each vehicle type is charged differently.
 *
 * @author Reuben
 */
public abstract class Vehicle {

    private String vehicleID;
    private String brand;
    private String model;
    private int year;
    private int rentalDays;

    // Counts how many Vehicle objects have been created (shared by all objects).
    private static int vehicleCount = 0;

    // Default constructor
    public Vehicle() {
        vehicleCount++;
    }

    // Parameterized constructor
    public Vehicle(String vehicleID, String brand, String model, int year, int rentalDays) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalDays = rentalDays;
        vehicleCount++;
    }

    // ----- Setters and Getters -----
    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    /**
     * Abstract method - has no body. Each subclass provides its own
     * rental fee computation.
     *
     * @return the computed rental fee
     */
    public abstract double calculateRentalFee();

    /**
     * Displays the common vehicle information.
     */
    public void displayVehicleInfo() {
        System.out.println("Vehicle ID\t: " + vehicleID);
        System.out.println("Brand\t\t: " + brand);
        System.out.println("Model\t\t: " + model);
        System.out.println("Year\t\t: " + year);
        System.out.println("Rental Days\t: " + rentalDays);
    }

    /**
     * Overloaded version of displayVehicleInfo(). When showRentalFee is
     * true, the calculated rental fee is displayed as well.
     *
     * @param showRentalFee true to show the calculated rental fee
     */
    public void displayVehicleInfo(boolean showRentalFee) {
        displayVehicleInfo();
        if (showRentalFee) {
            System.out.printf("Rental Fee\t: PHP %,.2f%n", calculateRentalFee());
        }
    }

    /**
     * Static method that returns the number of vehicle objects created.
     *
     * @return number of Vehicle objects created
     */
    public static int getVehicleCount() {
        return vehicleCount;
    }
}
