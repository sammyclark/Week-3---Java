package Assessment;

/**
 * Created by student on 26/08/2016.
 */
public class Desktop extends Computer{
    private String mon;
    private String keyB;
    private String mouse;
    //fields

    //properties
    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getKeyB() {
        return keyB;
    }

    public void setKeyB(String keyB) {
        this.keyB = keyB;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    //constructors
    Desktop(){} //default constructor

    Desktop(String type, String model, String cpuType, double cpuSpeed, int hdCap, String graphType,
            double price, short ram, String mon, String keyB, String mouse){

        super(type, model, cpuType, cpuSpeed, hdCap, graphType, price, ram); //invokes Computer constructor
        this.mon = mon;
        this.keyB = keyB;
        this.mouse = mouse;

    }

    @Override
    public String toString() {
        return String.format("Desktop details: %s %s %s %s", super.toString(), this.mon, this.keyB, this.mouse);
    }
    //outputs string with properties of desktop
}
