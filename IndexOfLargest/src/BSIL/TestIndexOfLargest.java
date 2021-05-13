// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   6 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The TestIndexOfLargest program is designed to take input from the user of 10 integer values. The program then calls a method called findIndex from
the IndexOfLargest class and uses this method to find the maximum integer value. The program then prints a list of user inputted values and prints
the index position of the largest value.
*/


public class TestIndexOfLargest
{


    public static void main(String[] args)          //Program main method
    {

        Scanner userInput = new Scanner(System.in);         //Created scanner

        System.out.println("\nWelcome to The Largest Index Finder ");                    // Welcome prompt for user
        System.out.println("Please follow the prompts below: ");

        boolean quitValue = false;

        //Do-while loop to create sentinel structure for the user. Quite value is 0

        do
        {

            int[] inputList = new int[10];      //Declaring array for user input

            System.out.println("\nEnter 10 integers (Enter \"0\" to stop): ");

            //Taking and storing input from the user in an array

            int a;
            for (a = 0; a <= 9; a = a + 1)
            {
                inputList[a] = userInput.nextInt();
                int input = inputList[a];

                //creating break to terminate loop if user input value = 0

                if (input == 0)
                {
                    quitValue = true;
                    break;
                }

            }

            //Using continue to skipp to end of loop and terminate if user inputs 0

            if (quitValue)
                continue;

            //Calling findIndex method from IndexOfLargest class. Method returns index of largest value.

            int largestIndex = IndexOfLargest.findIndex(inputList);

            //Printing out user inputted values and index of largest value

            System.out.print("\nYou entered these values:\t");

            //Using for loop to print out every value in array

            for (int value : inputList)
                System.out.print(value + " ");

            System.out.print("\nIndex of largest value:\t\t");
            System.out.println(largestIndex);

        } while (!quitValue);           //Loop terminate when user inputs 0

    }

}