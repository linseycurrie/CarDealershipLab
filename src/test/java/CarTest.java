import Vehicles.Car;
import Vehicles.Components.Engine;
import Vehicles.Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car mini;
    Engine small;
    Tyres michelin;


    @Before
    public void before(){
        small = new Engine("small", "petrol");
        michelin = new Tyres("round", 4);
        mini = new Car(2000, "red", small, michelin );

    }

    @Test
    public void carCanHaveEngine(){
        assertEquals(small, mini.getEngine());
    }

    @Test
    public void carCanHaveTyres(){
        assertEquals(michelin, mini.getTyres());
    }

    @Test
    public void carPriceIsReducedByDamagedAmount(){
        mini.reducePriceByDamage(500);
        assertEquals(1500, mini.getPrice(), 0.01);
    }
}
