/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicle;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[1] = new Car("JPK123", "Toyota", "Corolla", 100, 4);
        vehicles[2] = new Motorcycle("JPX789", "Honda", "CBR600RR", 80, 600);
        
        int rentalDays = 5;   
        
        for (Vehicle vehicle : vehicles) {
            if (vehicle == null) {
                continue; // Skip null elements
            }
            
            System.out.println(vehicle);
            System.out.println("Rental Cost for " + rentalDays + " days: RM" + vehicle.calculateRentalCost(rentalDays));

            if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println("Top Speed: " + motorcycle.getTopSpeed() + " km/h");
            }

            System.out.println();
       }
    }
}
   
