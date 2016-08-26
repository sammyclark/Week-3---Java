package Assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static Assessment.TaskProcessing.compDesk;
import static Assessment.TaskProcessing.compLap;

/**
 * Created by student on 26/08/2016.
 */
public class Menu {

    static Scanner input = new Scanner(System.in);

    static List<String> compData;
    static boolean desktop;
    static char compType;

    static void display() { //method to call the display
        char option;
        do {
            System.out.println("Main Menu");
            System.out.println("Please enter a letter");
            System.out.println("Press C to create a new computer");
            System.out.println("Press N to create a new customer");
            System.out.println("Press S to search");
            System.out.println("Press M to match a customer with a computer");
            System.out.println("Press O to sort computers");
            System.out.println("Press L to list computers");
            System.out.println("Press Q to quit");

            //display output

            //read input
            option = input.nextLine().charAt(0);

        } while (option != 'C' && option != 'N' && option != 'S' && option != 'M' &&
                option != 'O' && option != 'L' && option != 'Q');
        //runs the loop

        int index;
        List<String> tempData = new ArrayList<>(); //tempData collects information given
        switch(option) {
            case 'C':
                inputScreen();

                display();
                break;
            case 'N':
                // index = findFirstName();
                // tempData = inputScreen();
                //TaskProcessing.editDetails(index, tempData);
                display();
                break;
            case 'S':
                //TaskProcessing.removeEmployee(requestIndex());
                // display();
                break;
            case 'M':
                // TaskProcessing.printAll();
                //  display();
                break;
            case 'O':
                compLap.sort()
                TaskProcessing.printAll();

                display();
                break;
            case 'L':
                break;
            case 'Q':
                break;
        }
    }

    static void inputScreen() {

        compData = new ArrayList<>();

        System.out.println("Would you like to create a desktop or a laptop");
        System.out.println("Press D for desktop or L for laptop");

        compType = input.nextLine().charAt(0);

        System.out.print("Enter computer type: ");
        compData.add(input.nextLine());

        System.out.print("Enter computer model: ");
        compData.add(input.nextLine());

        System.out.print("Enter CPU type: ");
        compData.add(input.nextLine());

        System.out.print("Enter CPU size: ");
        compData.add(input.nextLine());

        System.out.print("Enter hard disk capacity: ");
        compData.add(input.nextLine());

        System.out.print("Enter graphic card type: ");
        compData.add(input.nextLine());

        System.out.print("Enter computer price: ");
        compData.add(input.nextLine());

        System.out.print("Enter RAM: ");
        compData.add(input.nextLine());

        if (compType == 'D') {
            desktopInfo();
        } else {
            laptopInfo();
        }

    }


    static void desktopInfo() {

        System.out.print("Enter monitor: ");
        compData.add(input.nextLine());

        System.out.print("Enter keyboard: ");
        compData.add(input.nextLine());

        System.out.print("Enter mouse: ");
        compData.add(input.nextLine());

        TaskProcessing.createDesktop(compData);
    }

    static void laptopInfo(){

        System.out.print("Enter battery life: ");
        compData.add(input.nextLine());

        System.out.print("Enter laptop weight: ");
        compData.add(input.nextLine());

        TaskProcessing.createLaptop(compData);
    }
}
