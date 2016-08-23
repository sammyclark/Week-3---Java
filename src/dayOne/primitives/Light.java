package dayOne.primitives;

import java.util.Scanner;

/**
 * Created by student on 22/08/2016.
 */
public class Light {
    static int lightSpeed = 186000;
    public static void main(String[] args){
        //calculate light speed
        //Evenson et al. - calculated 299,792,458m/s

        System.out.print("Enter numbers of days: ");
        Scanner input = new Scanner(System.in);
        long days = input.nextLong();


        System.out.println("In " + days);
        System.out.println("days light will travel about " + lightCalculator(days) + " miles");
    }

    static long lightCalculator(long days) {
        long seconds = days * 24 *60 * 60;
                return lightSpeed * seconds;
    }
}
