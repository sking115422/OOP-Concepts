// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   4 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The InputSum program is designed to accept user input of integers. The program then filters out all value less than
or equal to zero. It then computes the sum of those numbers and returns all positive integers input by the user and their sum.
*/
public class InputSum
{

    public static void main(String[] args)          //Program main method
    {


        Scanner userInput = new Scanner(System.in);         //Created scanner

        System.out.println("\nWelcome to the Input Summation Machine. ");       // Welcome prompt for user
        System.out.println("Please follow the prompts below: ");
        System.out.print("\nEnter positive integers (-1 to quit):");


        ////Declaration and Initialization

        int sum = 0;
        String enteredNumbers = "";
        int posInt = 0;

            //While loop asks for inputs from the user as long as the input is not -1. Loop will terminate when -1 is inputted.

            while (posInt != -1)
            {

                posInt = userInput.nextInt();           //Reading input from the user

                ////Calculations

                //If-then statement creates a string of all entries and sum them as long as the values are greater than or equal to 1 (since we only care about Z+)

                if (posInt >= 1) {

                    enteredNumbers = enteredNumbers + posInt + ", ";

                    sum = sum + posInt;
                }

            }

        /*
        When I created the string earlier to store all of the user inputs, I separated each number by a space and a comma.
        However, the string had an extra comma and space at the end that is not needed. So this shortens the string by 2
        characters at the end which removes the extra comma and space.
        */

        int stringLength = enteredNumbers.length();
        enteredNumbers = enteredNumbers.substring(0, stringLength - 2);

        ////Outputs

        //Returns a list of all entered values and sum to the user

        System.out.print("\nEntered Numbers:\t");
        System.out.println(enteredNumbers);
        System.out.println("The sum:\t\t\t" + sum);


    }

}