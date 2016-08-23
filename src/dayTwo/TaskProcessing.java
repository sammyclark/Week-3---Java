package dayTwo;

import java.time.LocalDate;
import java.util.List;
import static dayTwo.generatedPeople.people;

/**
 * Created by student on 23/08/2016.
 */
public class TaskProcessing {
    static void createEmployee(List<String> data) {
        SexType sex;
        if (data.get(7).contains("M"))
            sex = SexType.MALE;
        else
            sex = SexType.FEMALE;


        Employee temp = new Employee(
                data.get(0),
                data.get(1),
                Short.parseShort(data.get(2)),
                Double.parseDouble(data.get(3)),

                LocalDate.of(Integer.parseInt(data.get(4)), Integer.parseInt(data.get(5)), Integer.parseInt(data.get(6))),
                sex, data.get(8),
                LocalDate.of(Integer.parseInt(data.get(9)), Integer.parseInt(data.get(10)), Integer.parseInt(data.get(11)))

        );

        people.add(temp);
    }

    static void printAll() {
        for (Person e : people)
            System.out.println(e);
    }

}


