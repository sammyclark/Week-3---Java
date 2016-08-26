package Assessment;

/**
 * Created by student on 26/08/2016.
 */
public abstract class Computer {
    //fields
    private String type;
    private String model;
    private String cpuType;
    private double cpuSpeed;
    private int hdCap;
    private String graphType;
    private double price;
    private short ram;

    //properties


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public int getHdCap() {
        return hdCap;
    }

    public void setHdCap(int hdCap) {
        this.hdCap = hdCap;
    }

    public String getGraphType() {
        return graphType;
    }

    public void setGraphType(String graphType) {
        this.graphType = graphType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public short getRam() {
        return ram;
    }

    public void setRam(short ram) {
        this.ram = ram;
    }

    //constructors
    Computer(){} //default constructor

    public Computer(String type, String model, String cpuType, double cpuSpeed, int hdCap, String graphType,
                    double price, short ram) {

        this.type = type;
        this.model = model;
        this.cpuType = cpuType;
        this.cpuSpeed = cpuSpeed;
        this.hdCap = hdCap;
        this.graphType = graphType;
        this.price = price;
        this.ram = ram;

    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s %s",
                this.type, this.model, this.cpuType, this.cpuSpeed, this.hdCap,
                this.graphType, this.price, this.ram);
    }
    //writes out properties as string
}
