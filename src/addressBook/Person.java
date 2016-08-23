package addressBook;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by student on 23/08/2016.
 */
public class Person {
    //fields
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    //properties
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    //constructor

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
       // this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s",
                this.firstName, this.lastName);
    }

}
