package Assessment;

import javax.swing.text.Style;

/**
 * Created by student on 26/08/2016.
 */
public class Laptop extends Computer {
    private String battery;
    private double weight;
    //fields

    //properties
    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //constructors
    Laptop(){} //default constructor

    Laptop(String type, String model, String cpuType, double cpuSpeed, int hdCap, String graphType,
            double price, short ram, String battery, double weight){

        super(type, model, cpuType, cpuSpeed, hdCap, graphType, price, ram); //invokes Computer constructor
        this.battery = battery;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return String.format("Desktop details: %s %s %s", super.toString(), this.battery, this.weight);
    }
    //outputs string with properties of laptop

}
