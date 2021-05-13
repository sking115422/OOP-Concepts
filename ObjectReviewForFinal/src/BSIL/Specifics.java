package BSIL;

import java.util.Date;
import java.util.Scanner;

public class Specifics extends Cars
{

    Scanner userInput = new Scanner(System.in);

    private String vin = " ";
    private String licensePlate = " ";
    private int timesServiced = 0;
    private Date newDate = new Date ();


    Specifics () {

        System.out.println();
        System.out.print("Please enter VIN#: ");
        vin = userInput.nextLine();

        System.out.println();
        System.out.print("Please enter license plate #: ");
        licensePlate = userInput.nextLine();

        System.out.println();
        System.out.print("Please enter number of times serviced at this location: ");
        timesServiced = userInput.nextInt();


    }

    public String toString () {
        return (getLastName() + "   " + getMake() + "   " + getModel() + "   " + getYear() + "   " + vin + "   " + licensePlate + "   " + timesServiced + "   " + newDate );
    }


}
