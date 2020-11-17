import Vehicles.Car;
import Vehicles.Components.Engine;
import Vehicles.Components.Tyres;
import Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    HybridCar corolla;
    Car mini;
    Engine small;
    Engine medium;
    Tyres michelin;
    Customer customer;

    @Before
    public void before(){
        dealership = new Dealership(10000);
        michelin = new Tyres("round", 4);
        small = new Engine("small", "petrol");
        medium = new Engine("medium", "diesel");
        mini = new Car(2000,"pink", small, michelin);
        corolla = new HybridCar(1000, "Blue", medium, michelin);
        customer = new Customer(3000);
    }

    @Test
    public void canHoldCollectionOfCars(){
        dealership.buyVehicle(mini);
        dealership.buyVehicle(corolla);
        assertEquals(2, dealership.getNumberInCollection());
    }

    @Test
    public void canSellVehicleToCustomer(){
        dealership.buyVehicle(mini);
        dealership.buyVehicle(corolla);
        dealership.sellVehicle(customer, mini);
        assertEquals(1, dealership.getNumberInCollection());
        assertEquals(1,customer.getNumberOfOwnedCars());
        assertEquals(12000, dealership.getTill(), 0.01);
    }

    @Test
    public void canRepairDamagedVehicle(){
        mini.reducePriceByDamage(500);
        dealership.repairDamageToVehicle(mini, 500);
        assertEquals(2000, mini.getPrice(), 0.01);
    }
}
