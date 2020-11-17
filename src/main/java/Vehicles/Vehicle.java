package Vehicles;

import Vehicles.Components.Engine;
import Vehicles.Components.Tyres;

public abstract class Vehicle {

    private double price;
    private String colour;
    private Engine engine;
    private Tyres tyres;

    public Vehicle(double price, String colour, Engine engine, Tyres tyres){
        this.price = price;
        this.colour = colour;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public void reducePriceByDamage(double damageAmount){
        setPrice(getPrice() - damageAmount);
    }

    public void repairDamage(double damageAmount){
        setPrice(getPrice() + damageAmount);
    }
}


