package Vehicles.Components;


public class Engine {

    private String size;
    private String fuelType;

    public Engine(String size, String fuelType) {
        this.size = size;
        this.fuelType = fuelType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFueltype() {
        return fuelType;
    }

    public void setFueltype(String fueltype) {
        this.fuelType = fueltype;
    }
}
