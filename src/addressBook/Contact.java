package addressBook;

/**
 * Created by student on 23/08/2016.
 */
public class Contact {
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
    public Contact(String phoneNo, String email, String facebook, Person p, Address a) {
        this.phoneNo = phoneNo;
        this.email = email;
        this.facebook = facebook;
        this.p = p;
        this.a = a;
    }

    @Override
    public String toString() {
        return String.format("Person: %s %s %s %s %s",
                this.phoneNo, this.email, this.facebook, this.p, this.a);

    }
}