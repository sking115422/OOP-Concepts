// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   5 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The TestMyRectangle program is designed to take an inputs from the user of two double values (width and height). The program then uses these values to to determine
if a rectangle is valid (width * height > 30). If the rectangle is valid the program will say that the rectangle is valid then compute and return the area and perimeter
values for the given width and height input. If the rectangle is not valid then the program will return that the rectangle is invalid.

The program will continue to ask for input from the user until -1 is entered. This terminates the program.

Three methods (isValid, Area, and Perimeter) are called to preform calculations in the this program. They are under public class MyRectangle.
*/


public class TestMyRectangle
{


    public static void main(String[] args)          //Program main method
    {

        Scanner userInput = new Scanner(System.in);         //Created scanner

        //Initial user prompt

        System.out.println("\nWelcome to the Rectangle Area and Perimeter Calculator!");
        System.out.println("Please follow the prompts below: ");

        ////Declarations

        double width;
        double height;

        double area;
        double perim;

        //Do-while loop used for sentinel structure. User input of -1 will terminate loop.

        do
        {

            //Initializing variables

            width = 0;
            height = 0;

            area = 0;
            perim = 0;

            //Reading first user input for width

            System.out.print("\nEnter width (-1 to exit program): ");
            width = userInput.nextDouble();

            //Skips to do-while condition and terminates code if user inputs -1

            if (width == -1)
                continue;

            //Reading second user input for height

            System.out.print("Enter height (-1 to exit program): ");
            height = userInput.nextDouble();

            //Skips to do-while condition and terminates code if user inputs -1

            if (height == -1)
                continue;

            ////Calculations

            //Calling Area and Perimeter methods from MyRectangle class to check validity and then compute area and perimeter if valid.

            area = MyRectangle.Area(width, height);
            perim = MyRectangle.Perimeter(width, height);

            ////Outputs

            //If statement returns that rectangle is invalid if area and perimeter equal 0

            //Else statement returns that rectangle is valid and the computed values for area and perimeter if rectangle is valid

            if (area == 0 && perim == 0)
                System.out.println("\nThis is an invalid rectangle.");
            else
            {
                System.out.println("\nThis is a valid rectangle.");
                System.out.print("The area is:\t  ");
                System.out.println(area);
                System.out.print("The perimeter is: ");
                System.out.println(perim);
            }

            //User prompt to enter more values if they want to continue or input -1 to stop

            System.out.println("\nEnter more height and width values if you wish to continue. Otherwise, enter -1 to exit the program.");


        } while (width != -1 && height != -1);

    }

}

