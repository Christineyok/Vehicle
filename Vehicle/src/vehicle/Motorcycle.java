/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author User
 */
public class Motorcycle extends Vehicle{
    private int engineCapacity;

    public Motorcycle(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, int engineCapacity) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getTopSpeed() {
        return engineCapacity * 50;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Adding RM150 for motorcycles with a top speed of at least 300
        if (getTopSpeed() >= 300) {
            return super.calculateRentalCost(days) + 150 * days;
        } else {
            return super.calculateRentalCost(days);
        }
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "vehicleNumber='" + getVehicleNumber() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", rentalRatePerDay=" + getRentalRatePerDay() +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
