import Vehicles.Car;
import Vehicles.Components.Engine;
import Vehicles.Components.Tyres;
import Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car mini;
    Tyres michelin;
    Engine small;
    Engine medium;
    HybridCar corolla;

    @Before
    public void before(){
        customer = new Customer(5000);
        michelin = new Tyres("round", 4);
        small = new Engine("small", "petrol");
        medium = new Engine("medium", "diesel");
        mini = new Car(2000,"pink", small, michelin);
        corolla = new HybridCar(1000, "Blue", medium, michelin);
    }

    @Test
    public void customerCanBuyCar(){
        customer.buyCar(mini);
        assertEquals(1, customer.getNumberOfOwnedCars());
    }

    @Test
    public void customerCanBuyAnyTypeOfCar(){
        customer.buyCar(corolla);
        assertEquals(1, customer.getNumberOfOwnedCars());
    }
}
