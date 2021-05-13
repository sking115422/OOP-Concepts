// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   6 - P3
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The TestDistinctValues program takes user input of 10 integer values. It then calls a method named getValues in the class called DistinctValues.
The method takes and array from the main method and return an array with only unique elements. The main method then compared the original array
and the new array to cull out the null values. The main then prints all of the unique elements in the new array.
*/


public class TestDistinctValues
{


    public static void main(String[] args)          //Program main method
    {

        Scanner userInput = new Scanner(System.in);         //Created scanner

        System.out.println("\nWelcome to The Distinct Values Finder!");                    // Welcome prompt for user
        System.out.println("Please follow the prompts below: ");

        boolean quitValue = false;

        //Do-while loop to create sentinel structure for the user. Quite value is 0

        do
        {

            int[] inputList = new int[10];      //Declaring array for user input

            System.out.print("\nEnter 10 integers (Enter \"-1000\" to stop): ");



            int a;
            for (a = 0; a <= 9; a = a + 1)
            {
                //Taking and storing input from the user in an array

                inputList[a] = userInput.nextInt();
                int input = inputList[a];

                //creating break to terminate loop if user input value = -1000

                if (input == -1000)
                {
                    quitValue = true;
                    break;
                }

            }

            //Skips to the end of code to terminate if user input is -1000

            if (quitValue)
                continue;


            System.out.print("\nArray before processing:\t");

            //Stepping through array and printing out array before processing

            for (int value : inputList)
                System.out.print(value + " ");

            //Calling getValues method from Distinct Values class to process the array

            int [] procAry = DistinctValues.getValues(inputList);

            System.out.print("\nArray after processing:\t\t");

            int b;
            int count = 0;

            /*
            Series of for loops compares initial array to processed array and only prints values that appear in initial
            array. This effectively filters out all of the zero placeholder in the array.
            */


            for (b = 0; b < procAry.length - 1; b = b + 1)
            {
                int c;
                for (c = b; c < procAry.length; c = c + 1)
                {

                    if (procAry[b] == inputList [c] && procAry[b] != procAry[b + 1])
                    {
                        System.out.print(procAry[b] + " ");
                        break;
                    }

                }

                //this piece of code accounts for the situation that all values in the array are the same and will still print out that value.

                if (inputList[b] == inputList [b + 1])
                    count = count + 1;


                if (count > 5)
                {
                    System.out.print(procAry[b] + " ");
                    break;
                }


            }

            System.out.println();

        } while (!quitValue);           //Loop terminate when user inputs -1000

    }

}