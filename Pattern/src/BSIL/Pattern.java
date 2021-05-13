// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   4 - P3
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The Pattern code is designed to return a specific pattern to the user based on the number of rows input by the user.
The pattern looks like this:

1 2 3 4 5 6
  1 2 3 4 5
    1 2 3 4
      1 2 3
        1 2
          1

 */


public class Pattern
{

    public static void main(String[] args)          //Program main method
    {



        Scanner userInput = new Scanner(System.in);         //Created scanner

        //User prompt asking user to input desired number of rows

        System.out.println("\nWelcome to the Pattern Creator!");
        System.out.println("\nHere is an example of the patten design:");
        System.out.println("1 2 3 4 5 6");
        System.out.println("  1 2 3 4 5");
        System.out.println("    1 2 3 4");
        System.out.println("      1 2 3");
        System.out.println("        1 2");
        System.out.println("          1");

        System.out.println("\nPlease enter desired number of rows:");

        ////Declaration, Initialization, and Reading inputs

        int rows = userInput.nextInt();
        int x = 0;
        int y = 0;

        System.out.println();

        ////Calculations and Outputs

        for (x = 1; x <= rows; x = x + 1)       //The first for loop controls how many total rows will be generated
        {
            System.out.print("");

            for (y = 1; y <= rows; y = y + 1)       //The second for loop controls how many columns will be generated
            {
                if (y < x)                        //If-then statement check if y < x and if so it inserts a space in stead of number
                    System.out.print("  ");       //This makes the pattern a triangle instead of a square
                else
                    System.out.print(y + 1 - x + " ");          //If y > x then the loop will insert a number
                                                                //However, we want every value in each row to decrease as the columns get smaller
            }                                                   //So, we must subtract by x to achieve this effect

            System.out.println();           //This print line returns a new row each time it is executed

        }

    }

}