package addressBook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 23/08/2016.
 */
public class AddedContact {

    public static Contact sarah = new Contact("07808018650", "sarah.s.clark@hotmail.com",
            "www.facebook.com/sammykinsclark", new Person("Sarah", "Clark", LocalDate.of(1993, 8, 22)),
            new Address("106 Dolphin Square", "Chichester Street", "London", "London", "LONDON", "SW1V 3LX"));

    public static List<Contact> contacts = new ArrayList<>();

    static void addPeople() {
        contacts.add(sarah);
    }


}
