// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   7 - P3
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The Grades program creates and populates a random 4x4 array with integers from 0 to 100. It then print those integers in table format for the user to see. It then calls a method called MinMaxAvg which find the minimum, maximum,
and average of the numbers in the 4x4 array. The min, max, and avg are then returned to the user.
*/


public class Grades
{


    public static void main(String[] args)          //Program main method
    {

        Scanner userInput = new Scanner(System.in);         //Created scanner

        System.out.println("\nWelcome to The Grades Checker Program!");                    // Welcome prompt for user
        System.out.println("Please follow the prompts below: ");

        int contVar = -1;

        //Do-while loop to create sentinel structure for the user. Quite value is 0


        System.out.print("\nEnter \"1\" to start or \"0\" to quit program: ");

        do
        {

            //Reading user input

            contVar = userInput.nextInt();

            if (contVar == 1)
            {

                int[][] grades = new int[4][4];      //Declaring array for user input

                //Nested for loops populates array with random values between 0 and 100

                int a, b;
                for (a = 0; a <= 3; a++)
                    for (b = 0; b <= 3; b++)
                        grades[a][b] = (int) ((Math.random() * 100) + Math.random());

                int count1;

                //Creating table format

                System.out.print("\nGrades:\n");

                //Using nested for loop to step through the array and print each value to the user in table format.

                for (a = 0; a <= 3; a++)
                {

                    count1 = 0;

                    System.out.print("    ");

                    for (b = 0; b <= 3; b++)
                    {

                        count1++;

                        if (count1 <= 3)
                                System.out.printf("%-6d", grades[a][b]);
                        else
                                System.out.printf("%-6d\n", grades[a][b]);

                    }

                }

                //Calling MinMaxAvg Method

                MinMaxAvg(grades);

                System.out.print("\nEnter \"1\" to rerun or \"0\" to quit program: ");

            }

            else
                continue;

            //code will run until user enters something other than 1

        }while (contVar == 1);

    }

    //* Method MinMaxAvg *

    /*
    This method is passed an array by the main and it find the min, man, and average for all value in the array. The method then prints the min, max, and avg in table format for the user.
    */

    public static void MinMaxAvg (int [] [] ary1)
    {


        System.out.println();

        //Nested for loop steps through the array and finds the max value.
        int x, y;
        int max = 0;

        for (x = 0; x <= 3; x++)
        {
            for (y = 0; y <= 3; y++)
            {
                if (ary1 [x] [y] > max)
                    max = ary1 [x] [y];
            }
        }

        //Printing max value

        System.out.print("Highest Grade:\t");
        System.out.println(max);

        //Nested for loop steps through the array and finds the min value.

        int min = 100;

        for (x = 0; x <= 3; x++)
        {
            for (y = 0; y <= 3; y++)
            {
                if (ary1 [x] [y] < min)
                    min = ary1 [x] [y];
            }
        }

        //Printing max value

        System.out.print("Lowest Grade:\t");
        System.out.println(min);

        //Nested for loop steps through the array and finds the average value.

        int sum = 0;
        int count = 0;
        double classAvg;

        for (x = 0; x <= 3; x++)
        {
            for (y = 0; y <= 3; y++)
            {
                sum = sum + ary1 [x] [y];
                count++;

            }
        }

        //Calculating and printing average value

        classAvg = (float) sum / (float) count;         //Forcing sum and count to be a floats so they will return a decimal value

        System.out.print("Class Average:\t");
        System.out.printf("%.2f", classAvg);
        System.out.println();

    }


}