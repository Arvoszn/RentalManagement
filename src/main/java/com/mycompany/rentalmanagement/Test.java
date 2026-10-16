/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalmanagement;

/**
 * Main class for the Dina and Gat Rent A Ride Service.
 *
 * Demonstrates the whole system: creates one Sedan, one Van and one
 * Motorcycle, stores them in a Vehicle array, then displays each vehicle's
 * information with its calculated rental fee, and finally the summary.
 *
 * @author Reuben
 */
public class Test {

    private static final String LINE = "==================================================";
    private static final String SEPARATOR = "--------------------------------------------------";

    public static void main(String[] args) {

        // 1. Create one object of each type with different vehicle information.
        Sedan sedan = new Sedan("SD001", "Toyota", "Vios", 2024, 3, 1500.00, 500.00);
        Van van = new Van("VN001", "Toyota", "HiAce", 2023, 2, 3000.00, 1000.00);
        Motorcycle motorcycle = new Motorcycle("MC001", "Honda", "Click 160", 2024, 4, 600.00, 200.00);

        // 2. Store the objects in a Vehicle array (polymorphism).
        Vehicle[] vehicles = {sedan, van, motorcycle};

        // 3. Display the header, every vehicle with its rental fee, and the summary.
        displayHeader();

        for (Vehicle vehicle : vehicles) {
            displayVehicle(vehicle);
            System.out.println();
            System.out.println(SEPARATOR);
            System.out.println();
        }

        displaySummary(vehicles);
    }

    /**
     * Displays the company header.
     */
    private static void displayHeader() {
        System.out.println(LINE);
        System.out.println("      DINA AND GAT RENT A RIDE SERVICE");
        System.out.println("           VEHICLE RENTAL SYSTEM");
        System.out.println(LINE);
        System.out.println();
    }

    /**
     * Displays one vehicle: basic information, vehicle type, and rental fee.
     *
     * @param vehicle the vehicle to display
     */
    private static void displayVehicle(Vehicle vehicle) {
        vehicle.displayVehicleInfo();

        if (vehicle instanceof Sedan) {
            ((Sedan) vehicle).displayVehicleType();
        } else if (vehicle instanceof Van) {
            ((Van) vehicle).displayVehicleType();
        } else if (vehicle instanceof Motorcycle) {
            ((Motorcycle) vehicle).displayVehicleType();
        }

        System.out.printf("Rental Fee\t: PHP %,.2f%n", vehicle.calculateRentalFee());
    }

    /**
     * Displays the number of vehicles created and the total rental fees.
     *
     * @param vehicles the array of vehicles to total up
     */
    private static void displaySummary(Vehicle[] vehicles) {
        double totalRentalFee = 0;

        for (Vehicle vehicle : vehicles) {
            totalRentalFee += vehicle.calculateRentalFee();
        }

        System.out.println(LINE);
        System.out.println("Total Vehicles: " + Vehicle.getVehicleCount());
        System.out.printf("Total Rental Fees: PHP %,.2f%n", totalRentalFee);
        System.out.println(LINE);
    }
}
