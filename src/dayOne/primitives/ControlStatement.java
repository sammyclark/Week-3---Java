package dayOne.primitives;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by student on 22/08/2016.
 */
public class ControlStatement {

    public static void main (String[] args) {
     /*   seasonCheck();

        numberCheck();

        caseCheck(); */

        // Menu();

        //getIceCream();

        //calc();

        //WhileInfinite();

        ForLoopTest();

    }

    static void seasonCheck(){
        int month = 4;
        String season;

        if(month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "Summer";
        else if (month == 9 || month == 10 || month == 11)
            season = "Autumn";
        else
            season = "Bogus Month";

        System.out.println("April is in the " + season);
    }

    static void numberCheck() {
        System.out.print("Please enter a number between 1 and 2000");
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        String myNum;

        if(num < 100)
            myNum = "Your number is equal to 100";
        else if (num >= 100 && num < 500)
            myNum = "Your number is equal to 500";
        else if (num >= 500 && num < 1000)
            myNum = "Your number is equal to 1000";
        else
            myNum = "Your number is beyond our scope";

        System.out.println(myNum);
    }

    static void caseCheck() {
        System.out.print("Please enter a character. It can be a letter of either case or number");
        Scanner input = new Scanner(System.in);
        char input2 = input.next().charAt(0);
        String myInput;

        if(Character.isUpperCase(input2) == true)
            myInput = "Your character is uppercase";
        else if (Character.isLowerCase(input2) == true)
            myInput = "Your character is lowercase";
        else if (Character.isDigit(input2) == true)
            myInput = "Your character is a number";
        else
            myInput = "Your character is neither letter nor a number";

        System.out.println(myInput);

    }

    static void Menu() {
        try {
            char choice;
            do {
                System.out.println("Helper Menu: ");
                System.out.println("1. If");
                System.out.println("2. Switch");
                System.out.println("3. While");
                System.out.println("4. Do While");
                choice = (char) System.in.read();
            }
            while (choice < '1' || choice > '4');

            switch(choice) {
                case '1':
                    System.out.println("If statement uses boolean condition");
                    break;
                case '2':
                    System.out.println("Switch uses constant expressions to compare");
                    break;
                case '3':
                    System.out.println("While is a simple loop, boolean condition");
                    break;
                case '4':
                    System.out.println("Just keep doing it");
                    break;
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            //System.out.println("This is not a character we needed.");
        }
    }

    static void getIceCream() {
        String price;
        String size;

        do {
            System.out.print("Please enter the size of ice cream you would like. Press x to exit");
            Scanner input = new Scanner(System.in);
            size = input.next();
        }
        while (size == "x");

        switch (size) {
            case "small":
                System.out.println("A small ice cream is £1.25");
                break;
            case "medium":
                System.out.println("A medium ice cream is £2.25");
                break;
            case "large":
                System.out.println("A large ice cream is £3.25");
                break;
            case "huge":
                System.out.println("A huge ice cream is £4");
                break;
        }
    }

    static void calc() {
            Scanner input = new Scanner(System.in);

            String value1, value2, op;
            long ans;

            System.out.println("Enter first number: ");
            value1 = input.nextLine();
            int num1 = Integer.parseInt(value1);

            System.out.println("Enter second number: ");
            value2 = input.nextLine();
            int num2 = Integer.parseInt(value2);

            System.out.println("Enter operator: ");
            op = input.nextLine();

            switch (op) {
                case "+":
                    int ans1 = num1 + num2;
                    System.out.println(ans1);
                    break;
                case "-":
                    int ans2 = num1 - num2;
                    System.out.println(ans2);
                    break;
                case "x":
                    int ans3 = num1 * num2;
                    System.out.println(ans3);
                    break;
                case "%":
                    int ans4 = num1 / num2;
                    System.out.println(ans4);
                    break;
            }

        }

    static void WhileInfinite(){
        int index = 0;

        outer:
        while (true) {
            int value = ++index;

            System.out.println(value);

            if (value == 5) {
                System.out.println("Found it!");
                break outer;
            }

            if (value ==10) {
                break;
            }
        }

    }

    static void ForLoopTest () {
        String[] data = {"This", "is", "a", "string"};

        for(int i = 0; i <= data.length - 1; i++) {
            System.out.println(data[i]);
        }

        String result = "";
        //each string using s in data
        for (String s : data) {
            result += String.format(s + " ");
        }
        System.out.println(result);
    }

}
