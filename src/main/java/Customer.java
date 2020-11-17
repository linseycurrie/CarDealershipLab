import Vehicles.Car;
import Vehicles.Vehicle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Vehicle> ownedCars;

    public Customer(double money){
        this.money = money;
        ownedCars = new ArrayList<Vehicle>();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getNumberOfOwnedCars() {
        return ownedCars.size();
    }

    public void buyCar(Vehicle vehicle) {
        this.ownedCars.add(vehicle);
        this.setMoney(this.getMoney() - vehicle.getPrice());
    }
}
