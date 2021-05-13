// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   4
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.Scanner;       //Imported scanner class


//// The driving cost program is designed to take user input (specifically distance to drive, fuel efficiency, and price per gallon of fuel) and compute with this information the total cost for fuel of a particular trip.


public class DrivingCost {

    public static void main(String[] args)      //Program main method
    {


        ////Declarations and reading inputs from the user


        System.out.println("Welcome to the driving cost calculator application!");      //Welcome statement

        Scanner Value = new Scanner(System.in);         //Creating scanner object

        System.out.println("Please enter distance to drive (in miles): ");                  //Prompting user to input the driving distance
        double distance = Value.nextDouble();                                               //Assigning data type as double and storing the user value as a variable

        System.out.println("Please enter the fuel efficiency of the car (mpg): ");          //Prompting user to input the fuel efficiency
        double efficiency = Value.nextDouble();                                             //Assigning data type as double and storing the user value as a variable

        System.out.println("Please enter the price per gallon of fuel ($): ");              //Prompting user to input the cost of fuel
        double pricePerGal = Value.nextDouble();                                            //Assigning data type as double and storing the user value as a variable


        ////Calculations


        double tripCost = (distance / efficiency) * pricePerGal;                            //Computing total trip cost based on inputs stored above


        ////Outputs


        System.out.println("\nTest Data");                                                  //Print out header with formatting to seperate from previous print out
        System.out.println("\t\t\t\tThe distance (miles): \t\t\t" + distance);              //Print out driving distance in miles formatted with tabs
        System.out.println("\t\t\t\tFuel efficiency (mpg): \t\t\t" + efficiency);           //Print out fuel efficiency in mpg formatted with tabs
        System.out.print("\t\t\t\tPrice per gallon (dollars): \t$");                        //Print out price per gallon string in dollars formatted with tabs and $
        System.out.printf("%.2f%n", pricePerGal);                                           //Print out actual price per gal value formatted to 2 decimal places with a new line after
        System.out.print("\t\t\t\tThe trip cost (dollars): \t\t$");                         //Print out trip cost in dollars formatted with tabs
        System.out.printf("%.2f", tripCost);                                                //Print out trip cost value formated to 2 decimal places

    }
}
