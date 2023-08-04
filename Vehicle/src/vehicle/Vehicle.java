/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author User
 */
public class Vehicle {
    private String vehicleNumber;
    private String manufacturer;
    private String model;
    private double rentalRatePerDay;

    public Vehicle(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    public void setRentalRatePerDay(double rentalRatePerDay) {
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public double calculateRentalCost(int days) {
        return rentalRatePerDay * days;
    }
    
    public Vehicle getVehicle() {
        return this;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", rentalRatePerDay=" + rentalRatePerDay +
                '}'; 
    }
}
