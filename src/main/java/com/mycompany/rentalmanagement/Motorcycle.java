/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalmanagement;

/**
 * Motorcycle vehicle type.
 *
 * Rental Fee = (Rental Days x Daily Rate) + Helmet Fee
 *
 * @author Reuben
 */
public class Motorcycle extends Vehicle {

    private double dailyRate;
    private double helmetFee;

    public Motorcycle(String vehicleID, String brand, String model,
            int year, int rentalDays, double dailyRate, double helmetFee) {
        super(vehicleID, brand, model, year, rentalDays);
        this.dailyRate = dailyRate;
        this.helmetFee = helmetFee;
    }

    // ----- Setters and Getters -----
    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getHelmetFee() {
        return helmetFee;
    }

    public void setHelmetFee(double helmetFee) {
        this.helmetFee = helmetFee;
    }

    @Override
    public double calculateRentalFee() {
        return (getRentalDays() * dailyRate) + helmetFee;
    }

    /**
     * Shows the vehicle type.
     */
    public void displayVehicleType() {
        System.out.println("Vehicle Type\t: Motorcycle");
    }
}
