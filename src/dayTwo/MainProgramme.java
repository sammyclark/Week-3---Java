package dayTwo;

import static dayTwo.generatedPeople.people;
/**
 * Created by student on 23/08/2016.
 */
public class MainProgramme {

    public static void main(String[] args) {

        generatedPeople.addPeople();

        for(Person p : people) {
            System.out.println(p);
        }

    }

}
