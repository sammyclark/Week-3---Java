package addressBook;

/**
 * Created by student on 23/08/2016.
 */
public class Contact extends Person{
    //fields
    private String phoneNo;
    private String email;
    private String facebook;

    private Person p;
    private Address a;

    //properties
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

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    //constructor

    Contact(){}//default constructor

    public Contact(String firstName, String lastName, String phoneNo, String email, String facebook,
                   Address a) {
        super(firstName, lastName); //invokes person constructor
        this.phoneNo = phoneNo;
        this.email = email;
        this.facebook = facebook;
        this.a = a;
    }

    @Override
    public String toString() {
        return String.format("Contact: %s %s %s %s %s",
                super.toString(), this.phoneNo, this.email, this.facebook, this.a);
    }
    //displays contact properties as a string
}