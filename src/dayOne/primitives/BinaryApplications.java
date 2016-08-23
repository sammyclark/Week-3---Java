package dayOne.primitives;

import java.util.Scanner;

/**
 * Created by student on 22/08/2016.
 */
public class BinaryApplications {

    public static void main (String [] args) {
    getBinaryCalc();
    }

    static void getBinaryCalc() {
        System.out.println("Enter binary");
        Scanner input = new Scanner(System.in);
        String bin = input.nextLine();

        int result = 0, mult = 1;

        for (int i = bin.length() - 1; i >= 0 ; i--) {

            if (bin.charAt(i) == '1'){
                result += mult;

            }
            mult = mult * 2;
        }
        System.out.println("Decimal value: " + result);
    }


}
