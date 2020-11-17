package Vehicles;

import Vehicles.Components.Engine;
import Vehicles.Components.Tyres;
import Vehicles.Vehicle;

public class Car extends Vehicle{

    public Car(double price, String colour, Engine engine, Tyres tyres) {
        super(price, colour, engine, tyres);
    }



}
