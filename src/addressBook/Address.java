package addressBook;

/**
 * Created by student on 23/08/2016.
 */
public class Address {

    private String firstLine;
    private String secondLine;
    private String town;
    private String city;
    private String county;
    private String postcode;

    //properties


    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    //constructor

    public Address(String firstLine, String secondLine, String town, String city, String county, String postcode) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.town = town;
        this.city = city;
        this.county = county;
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return String.format("Person: %s %s %s %s %s %s",
                this.firstLine, this.secondLine, this.town, this.city, this.county, this.postcode);

    }
}
