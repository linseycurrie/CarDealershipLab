package Vehicles;

import Vehicles.Components.Engine;
import Vehicles.Components.Tyres;

public class ElectricCar extends Vehicle{


    public ElectricCar(double price, String colour, Engine engine, Tyres tyres) {
        super(price, colour, engine, tyres);
    }
}
