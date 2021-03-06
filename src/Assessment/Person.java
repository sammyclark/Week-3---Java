package Assessment;

import java.time.LocalDate;

/**
 * Created by student on 26/08/2016.
 */
public abstract class Person {
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
    Person(){}


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
