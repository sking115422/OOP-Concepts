// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   6 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The program CountOccurences is designed to take input from the user of integer between 1 and 100 up to 10 values. The program then calls a method
called Count to print the number of times each element of the array occurs.
*/


public class CountOccurrences
{


    public static void main(String[] args)          //Program main method
    {

        Scanner userInput = new Scanner(System.in);         //Created scanner

        System.out.println("\nWelcome to The Occurrence Counter!");                    // Welcome prompt for user
        System.out.println("Please follow the prompts below: ");


        System.out.print("\nEnter up to 10 integers between 1 and 100 (0 to execute) (-1 to stop): ");

        //Declaring variables

        boolean quitValue = false;
        boolean executeValue = false;

        int input = 1;

        int a = 0;
        int[] inputList = new int[100];


        //First do while loop terminates the program if the user inputs -1

        do
        {

            //Second do while loop executes the program if the user inputs 0

            do
            {

                //This for loop all array values to zero at the start of every loop iteration
                for (a = 0; a <= 99; a++)
                {
                    inputList[a] = 0;
                }

                //This for loop allows the user to input up to 100 values
                for (a = 0; a <= 99; a++)
                {

                    //Reading user inputs

                    inputList[a] = userInput.nextInt();
                    input = inputList[a];

                    //Assigning execute boolean value so code will execute when user inputs 0

                    if (input == 0)
                    {
                        executeValue = true;
                        break;
                    }

                    //Assigning a quit boolean value so code will terminate when user inputs -1

                    if (input == -1)
                    {
                        quitValue = true;
                        break;
                    }

                }

            } while (!executeValue);

            //Inserting a break to help stop code after -1 is input

            if (quitValue)
                break;

            //Declaring variables

            int[] inputListFiltered = new int[10];

            int b;
            int c;
            int d = 0;
            int count = 0;

            //These nested for loop filters all of the values out of range and creates a new array with up to 10 valid elements

            for (b = 0; b <= 99; b++)
            {
                for (c = 0; c <= 9; c++)
                {
                    if (1 <= inputList[b] && inputList[b] <= 100 && count <= 10)
                    {
                        count++;
                        inputListFiltered[d++] = inputList[b];
                        break;
                    }

                }

            }

            //Calling Count method to find number of occurrences of each element in the filtered array

            Count(inputListFiltered);

            System.out.print("\nEnter up to 10 integers between 1 and 100 (0 to execute) (-1 to stop): ");

        }while(!quitValue);
    }


    // * COUNT METHOD *

    /*
    This method steps through the user inputted array (ary1) and compares each value to every other value in the array then if they are equal breaks
    to stop the counter at the corresponding index value. if the two counters are equal then it store the current value in a new array called (ary2).
    The method then compares the values in ary1 with ary2 in order to see which values in ary2 are not null and counts the number of times they occur.
    Then the method prints out the unique elements and also the number of times they occur.
    */

    public static void Count(int[] ary1)
    {

        System.out.println();


        //Declaring variables

        int[] ary2 = new int[10];

        int a;
        int b;
        int c = 0;

        //Creating an array of only unique values

        for (a = 0; a < ary2.length; a = a + 1)
        {

            for (b = 0; b < a; b = b + 1)
            {
                if (ary1[a] == ary1[b])
                {
                    break;
                }
            }

            if (a == b)
                ary2[c++] = ary1[a];

        }

        //Declaring variables;

        int x;
        int y = 0;
        int count;

        //Comparing array of only unique values to original array so we can count number of time the unique elements occur

        for (x = 0; x < ary2.length; x++)
        {

            count = 0;

            for (y = 0; y < ary1.length; y++)
            {

                if (ary2[x] == ary1[y])
                    count++;
            }

            //Filtering out the null values and printing the number of times each unique element has occurred

            if (ary2[x] != 0)
            {
                System.out.print(ary2[x]);
                System.out.print(" occurred ");
                System.out.print(count);
                System.out.println((count == 1 ? " time" : " times"));      //Using condensed if then statements to match word case where appropriate
            }

        }

    }
}
