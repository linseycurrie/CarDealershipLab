package Vehicles.Components;

public class Tyres {

    private String type;
    private int numberOf;

    public Tyres(String type, int numberOf){
        this.type = type;
        this.numberOf = numberOf;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
