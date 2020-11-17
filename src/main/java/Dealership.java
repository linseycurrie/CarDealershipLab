import Vehicles.Car;
import Vehicles.Vehicle;

import javax.swing.text.View;
import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> carCollection;

    public Dealership(double till){
        this.till = till;
        carCollection = new ArrayList<Vehicle>();
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void buyVehicle(Vehicle vehicle) {
        this.carCollection.add(vehicle);
    }

    public int getNumberInCollection() {
        return this.carCollection.size();
    }

    public void sellVehicle(Customer customer, Vehicle vehicle) {
        if(customer.getMoney() > vehicle.getPrice() && this.carCollection.contains(vehicle)){
            customer.buyCar(vehicle);
            this.carCollection.remove(vehicle);
            this.setTill(this.till + vehicle.getPrice());
        }
    }

    public void repairDamageToVehicle(Vehicle vehicle, double damageAmount){
        vehicle.repairDamage(damageAmount);
        setTill(getTill() - damageAmount);
    }
}
