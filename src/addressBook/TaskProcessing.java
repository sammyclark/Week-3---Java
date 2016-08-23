package addressBook;

import java.util.List;

import static addressBook.AddedContact.contacts;

/**
 * Created by student on 23/08/2016.
 */
public class TaskProcessing {
    static void createContact(List<String> data) {

        Contact temp = new Contact(data.get(0), data.get(1), data.get(2),
               new Person(data.get(3), data.get(4)),
                new Address(data.get(5), data.get(6)));

        contacts.add(temp);
    }

    static void printAll() {
        for (Contact c : contacts)
            System.out.println(c);
    }
}
