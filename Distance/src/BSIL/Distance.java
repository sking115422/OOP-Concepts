// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   3
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.Scanner;       //Imported Scanner Class

////Distance programs is designed to find the distance between two coordinate point inputted by the user.

public class Distance
{

    public static void main(String[] args)          //Program main method
    {


        ////Declarations and reading inputs from user


        System.out.println("Welcome to the distance between two cooridinate points calculator!");       //Welcome statement for program and explanation of purpose to user

        Scanner Value = new Scanner(System.in);     //Creating scanner object

        System.out.println("Please enter a value for coordinate x1: ");        //User input for x1 coordinate value
        double x1 = Value.nextDouble();                                        //Assigning the user input as a declared variable

        System.out.println("Please enter a value for coordinate y1: ");        //User input for y1 coordinate value
        double y1 = Value.nextDouble();                                        //Assigning the user input as a declared variable

        System.out.println("Please enter a value for coordinate x2: ");        //User input for x2 coordinate value
        double x2 = Value.nextDouble();                                        //Assigning the user input as a declared variable

        System.out.println("Please enter a value for coordinate y2: ");        //User input for y2 coordinate value
        double y2 = Value.nextDouble();                                        //Assigning the user input as a declared variable


        ////Calculations


        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));      //Formula to compute distance between the inputted coordinates


        ////Outputs


        System.out.println("\nTest Data");                                                              //Printing out header for problem solution
        System.out.println("\t\t\t\tFirst point coordinates: \t" + "(" + x1 + ", " + y1 + ")");         //Printing out first set of coordinates with tab for spacing
        System.out.println("\t\t\t\tSecond point coordinates: \t" + "(" + x2 + ", " + y2 + ")");        //Printing out second set of coordinates with tab for spacing
        System.out.println("\t\t\t\tThe distance is: \t\t\t" + distance);                               //Printing out calculated distance between the coordinates with 3 tabs for spacing

        
    }
}