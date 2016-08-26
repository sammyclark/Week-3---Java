package Assessment;


/**
 * Created by student on 26/08/2016.
 */
public class Customer extends Person {
    private int custID;
    private String addressLine;
    private String postcode;
    private String phoneNo;
    private String email;
    //fields

    //properties
    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //constructor
    Customer(){}

    public Customer(String firstName, String lastName, String addressLine, String postcode,
                    String phoneNo, String email) {
        super(firstName, lastName); //invokes person constructor
        this.phoneNo = phoneNo;
        this.email = email;

    }
    @Override
    public String toString() {
        return String.format("Contact: %s %s %s %s %s",
                super.toString(), this.addressLine, this.postcode, this.phoneNo, this.email);
    }
    //displays contact properties as a string
}
