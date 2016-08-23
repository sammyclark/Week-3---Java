package dayTwo;

import java.time.LocalDate;

/**
 * Created by student on 23/08/2016.
 */
public class Employee extends Person {
    private String position;
    private LocalDate hireDate;

        Employee(String firstName, String lastName, short height, double weight, LocalDate birthDate,
                SexType sex, String pos, LocalDate hd)
        {

            super(firstName, lastName, height, weight, birthDate, sex);
            this.position = pos;
            this.hireDate = hd;
        }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return String.format("Employee Name: %s %s %s", super.toString(), this.position, this.hireDate);
        }

}
