/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author User
 */
public class Car extends Vehicle{
   private int numberOfDoors;

    public Car(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, int numberOfDoors) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Adding RM35 per day for cars with more than two doors
        if (numberOfDoors > 2) {
            return super.calculateRentalCost(days) + 35 * days;
        } else {
            return super.calculateRentalCost(days);
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Car{" +
                "vehicleNumber='" + getVehicleNumber() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", rentalRatePerDay=" + getRentalRatePerDay() +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
