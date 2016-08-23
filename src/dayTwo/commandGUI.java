package dayTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static dayTwo.generatedPeople.people;
/**
 * Created by student on 23/08/2016.
 */
public class commandGUI {
    static Scanner input = new Scanner(System.in);

    static void display() {
        int choice;
        do {
            System.out.println("Welcome to the Employee Database");
            System.out.println("1. Add an Employee");
            System.out.println("2. Edit an Employee");
            System.out.println("3. Remove an Employee");
            System.out.println("4. List all Employees");
            System.out.println("5. Search by First Name");
            System.out.println("6. Terminate");
            System.out.println();
            System.out.println("Enter a number between 1 and 6: ");

            //read input
            choice = input.nextInt();

        } while (choice < 1 || choice > 6);

        int index;
        List<String> tempData = new ArrayList<>();
        switch(choice) {
            case 1:
                tempData = inputScreen();
                TaskProcessing.createEmployee(tempData);
                display();
            case 2:
                index = findFirstName();
                tempData = inputScreen();
                TaskProcessing.editDetails(index, tempData);
                display();
            case 3:
                TaskProcessing.removeEmployee(requestIndex());
                display();
            case 4:
                TaskProcessing.printAll();
                display();
            case 5:
                index = findFirstName();
                System.out.println(people.get(index));
                display();
            case 6:
                break;
        }
    }

    static List<String> inputScreen() {
        List<String> employeeData = new ArrayList<>();

        input.nextLine();
        System.out.print("Enter first name: ");
        employeeData.add(input.nextLine());

        //input.nextLine();
        System.out.print("Enter last name: ");
        employeeData.add(input.nextLine());

        //input.nextLine();
        System.out.print("Enter height: ");
        employeeData.add(input.nextLine());

        //input.nextLine();
        System.out.print("Enter weight: ");
        employeeData.add(input.nextLine());

        //input.nextLine();
        System.out.print("Enter DOB (YYYY/MM/DD): ");
        String dob = input.nextLine();
        String[] dobData = dob.split("/");

        for(int i = 0; i<= dobData.length-1; i++) {
            employeeData.add(dobData[i]);
        }

        //input.nextLine();
        System.out.print("Enter sex M/F: ");
        employeeData.add(input.nextLine());

        //input.nextLine();
        System.out.print("Enter position: ");
        employeeData.add(input.nextLine());

        //input.nextLine();
        System.out.print("Enter hire date (YYYY/MM/DD): ");
        String hireData = input.nextLine();
        String[] HireDate = dob.split("/");

        for(int i = 0; i<= HireDate.length-1; i++) {
            employeeData.add(HireDate[i]);
        }

        return employeeData;

    }

    static int findFirstName() {
        System.out. print("Enter first name: ");
        String firstName = input.next();
        return TaskProcessing.searchByFirstName(firstName);
    }

    static int requestIndex(){
        System.out.print("Enter Employee index to remove: ");
        return input.nextInt();
    }
}
