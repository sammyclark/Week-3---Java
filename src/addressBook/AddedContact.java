package addressBook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 23/08/2016.
 */
public class AddedContact {

    public static Contact sarah = new Contact("Sarah", "Clark", "07808018650", "sarah.s.clark@hotmail.com",
            "www.facebook.com/sammykinsclark",
          new Address("106 Dolphin Square", "SW1V 3LX"));

    public static List<Contact> contacts = new ArrayList<>();

    static void addPeople() {
       contacts.add(sarah);
    }


}
