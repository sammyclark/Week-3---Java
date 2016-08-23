package dayTwo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 23/08/2016.
 */
public class generatedPeople {
    public static Person sarah = new Person("Sarah", "Clark", (short)162.5, 53,
            LocalDate.of(1993, 8, 22), SexType.FEMALE);

    public static Person alex = new Person("Alex", "Kingham", (short)166, 56,
            LocalDate.of(1993, 3, 10), SexType.FEMALE);

    public static Employee marie = new Employee("Marie", "Walker-Smith", (short)175, 62,
            LocalDate.of(1992, 12, 1), SexType.FEMALE, "Architect", LocalDate.of(2014, 9, 15));

    public static List<Person> people = new ArrayList<>();

    static void addPeople(){
        people.add(sarah);
        people.add(alex);
        people.add(marie);
    }
}
