package addressBook;

import dayTwo.TaskProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 23/08/2016.
 */
public class commandGUI {
    static Scanner input = new Scanner(System.in);

    static void display() {
        int choice;
        do {
            System.out.println("Welcome to your Contact Database");
            System.out.println("1. Add a Contact");
            System.out.println("2. Edit a Contact");
            System.out.println("3. Remove a Contact");
            System.out.println("4. List all Contacts");
            System.out.println("5. Search by First Name");
            System.out.println("6. Terminate");
            System.out.println();
            System.out.println("Enter a number between 1 and 6: ");

            //read input
            choice = input.nextInt();

        } while (choice < 1 || choice > 6);

        List<String> tempData = new ArrayList<>();
        switch(choice) {
            case 1:
                tempData = inputScreen();
                addressBook.TaskProcessing.createContact(tempData);
            case 2:
            case 3:
            case 4:
                addressBook.TaskProcessing.printAll();
                display();
            case 5:
            case 6:
                break;
        }
    }

    static List<String> inputScreen() {
        List<String> contactData = new ArrayList<>();

        input.nextLine();
        System.out.print("Enter first name: ");
        contactData.add(input.nextLine());

        System.out.print("Enter last name: ");
        contactData.add(input.nextLine());

        System.out.print("Enter first line of address: ");
        contactData.add(input.nextLine());

        System.out.print("Enter postcode: ");
        contactData.add(input.nextLine());

        System.out.print("Enter phone number: ");
        contactData.add(input.nextLine());

        System.out.print("Enter email address: ");
        contactData.add(input.nextLine());

        System.out.print("Enter facebook: ");
        contactData.add(input.nextLine());



        return contactData;

    }
}
