// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   4 - P4
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The LargestOccurrenceCount program is designed to take user input of integers and filter out all the values less than or equal to zero. Then, the program will find the largest value
and how many times it has occurred. It will then return to the user all of the user input values greater than 0, the largest value, and the number of
times the largest value occurred.
*/


public class LargestOccurrenceCount
{

    public static void main(String[] args)          //Program main method
    {


        Scanner userInput = new Scanner(System.in);         //Created scanner

        //User prompt

        System.out.println("\nWelcome to the Largest Value Counter. ");
        System.out.println("Please follow the prompts below: ");
        System.out.print("\nEnter positive integers (0 to quit):");

        ////Declarations and Initializations

        int integers = -1;
        String entries = "";
        int stringLength = 0;
        int old = 0;
        int largestValue = 0;
        int occurrences = 0;
        int x = 0;
        int entriesAsInt = 0;
        int largestValueChar = 0;

            ////Calculations

            //While loop checks to make sure that value input is not 0, as 0 is the terminal value.
            //Once 0 is input user can no longer input data

            while (integers != 0)
            {
                integers = userInput.nextInt();

                if (integers >= 1)          //If-then statement filters out all values less than 1 and also saves them in a string
                {

                    entries = entries + integers + " ";

                    if (integers > old)         //If-then statement checks new input by user against old value and if it is greater stores that value as "largestValue"
                    {

                        largestValue = integers;
                        old = integers;

                    }

                }

            }

            /*
            Since the largest value is stored as an integer and when we step through the string that saves the user input the values are output as characters, we need for find the
            ASCII values associated with all possible outcomes for our largest value. The if-then statement below takes the largest value generated above and turns it into is corresponding ASCII value so we can compare
            it to each character in the user input string later on.
            */

            if (largestValue == 1)
                largestValueChar = 49;      //ASCII value for 1
            else if (largestValue == 2)
                largestValueChar = 50;      //ASCII value for 2
            else if (largestValue == 3)
                largestValueChar = 51;      //ASCII value for 3
            else if (largestValue == 4)
                largestValueChar = 52;      //ASCII value for 4
            else if (largestValue == 5)
                largestValueChar = 53;      //ASCII value for 5
            else if (largestValue == 6)
                largestValueChar = 54;      //ASCII value for 6
            else if (largestValue == 7)
                largestValueChar = 55;      //ASCII value for 7
            else if (largestValue == 8)
                largestValueChar = 56;      //ASCII value for 8
            else
                largestValueChar = 57;      //ASCII value for 9

        stringLength = entries.length();        //Finding total length of string input by user so we know the bounds for our for loop

            //The for loop below steps through the first and every even value in the user input string. This picks out only the integer values and not the spaces between them

            for (x = 0; x <= stringLength - 1; x = x + 2)
            {

                entriesAsInt = (int) entries.charAt(x);

                /*
                The if-then below compares each character in the user inputted string to the largest value (both as ASCII value).
                If largest value equals a value in the string, the counter will increase thus tallying how many times the largest number occurs.
                */

                if (largestValueChar == entriesAsInt)
                    occurrences = occurrences + 1;
            }

        ////Outputs

        //The program returns to the user all the positive integers that were entered, the largest value, and the number of times that value occurred.

        System.out.print("\nYou entered:\t\t");
        System.out.println(entries);
        System.out.print("Largest value:\t\t");
        System.out.println(largestValue);
        System.out.print("Occurrences:\t\t");
        System.out.print(occurrences);
        System.out.println(" times");

    }
}
