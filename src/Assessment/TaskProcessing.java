package Assessment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * Created by student on 26/08/2016.
 */
public class TaskProcessing {

    public static List<Desktop> compDesk = new ArrayList<>(); //list of desktops
    public static List<Laptop> compLap = new ArrayList<>(); //list of laptops

    static void createDesktop(List<String> data) {



        Desktop temp = new Desktop(
                data.get(0),
                data.get(1),
                data.get(2),
                Double.parseDouble(data.get(3)),
                Integer.parseInt(data.get(4)),
                data.get(5),
                Double.parseDouble(data.get(6)),
                Short.parseShort(data.get(7)),
                data.get(8),
                data.get(9),
                data.get(10));

        compDesk.add(temp);
        }

    //adds a new desktop

    static void createLaptop(List<String> data2) {



        Laptop temp2 = new Laptop(
                data2.get(0),
                data2.get(1),
                data2.get(2),
                Double.parseDouble(data2.get(3)),
                Integer.parseInt(data2.get(4)),
                data2.get(5),
                Double.parseDouble(data2.get(6)),
                Short.parseShort(data2.get(7)),
                data2.get(8),
                Double.parseDouble(data2.get(9)));

        compLap.add(temp2);
    }

    //adds a new laptop

    static void printAll() {
        for (Computer c : compDesk)
            System.out.println(String.format("Desktops: %s" + c, compDesk.indexOf(c)));
        for (Computer l : compLap)
            System.out.println(String.format("Laptops: %s" + l, compDesk.indexOf(l)));
        //e and l call the toString methods in the Desktop and Laptop classes
        //indexOf prints the index numbers
    }
    }
