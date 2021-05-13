// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   7 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The MatrixAddition program takes user input to populate two 3 by 3 matrices. The main method then prints the two matrices inputted buy the user. The main method then calls a method
called "add" then takes the two matrices inputted by the user and adds them together. The method then prints out the summed matrix for the user.
*/


public class MatrixAddition
{


    public static void main(String[] args)          //Program main method
    {

        Scanner userInput = new Scanner(System.in);         //Created scanner

        System.out.println("\nWelcome to The Check Weekly Hours Program!");                    // Welcome prompt for user
        System.out.println("Please follow the prompts below: ");

        int contVar = -1;

        //Do-while loop to create sentinel structure for the user. Quite value is 0

        System.out.print("\nEnter \"1\" to start or \"0\" to quit program: ");

        do
        {

            contVar = userInput.nextInt();       //Reading user input

            int[][] arrayA = new int[3][3];      //Declaring arrayA for first user input
            int[][] arrayB = new int[3][3];      //Declaring arrayB for second user input

            //code only executes if user inputs 1

            if (contVar == 1)
            {

                //MATRIX A Population

                // For loops below ask for user input of integers and populates matrix A

                System.out.print("\nEnter integer values for Matrix A (3 x 3): ");

                int a, b;
                for (a = 0; a <= 2; a++)
                    for (b = 0; b <= 2; b++)
                        arrayA[a][b] = userInput.nextInt();

                //MATRIX B Population

                // For loops below ask for user input of integers and populates matrix B

                System.out.print("\nEnter integer values for Matrix B (3 x 3): ");

                for (a = 0; a <= 2; a++)
                    for (b = 0; b <= 2; b++)
                        arrayB[a][b] = userInput.nextInt();

                //MATRIX A Print Out

                // For loops below print out user inputted matrix A

                System.out.println("\nMatrix A:");

                int count1;

                for (a = 0; a <= 2; a++)
                {

                    count1 = 0;

                    System.out.print("    ");

                    for (b = 0; b <= 2; b++)
                    {

                        count1++;

                        if (count1 <= 2)
                            System.out.printf("%-5d", arrayA[a][b]);
                        else
                            System.out.printf("%-5d\n", arrayA[a][b]);

                    }

                }

                //MATRIX B Print Out

                // For loops below print out user inputted matrix B

                System.out.println("\nMatrix B:");

                for (a = 0; a <= 2; a++)
                {

                    count1 = 0;

                    System.out.print("    ");

                    for (b = 0; b <= 2; b++)
                    {

                        count1++;

                        if (count1 <= 2)
                            System.out.printf("%-5d", arrayB[a][b]);
                        else
                            System.out.printf("%-5d\n", arrayB[a][b]);

                    }

                }

                //Calling "add" Method

                add(arrayA, arrayB);

                System.out.print("\nEnter \"1\" to rerun or \"0\" to quit program: ");

            }

            else
                continue;

            //code will run until user enters something other than 1

        }while (contVar == 1);

    }


    //* Method add *

    /*
    This method takes the user inputted matrices (A & B) and sums each individual element to create the addition of matrix A with matrix B. The method then prints out Matrix A +
    Matrix B for the user.
    */


    public static void add (int [] [] ary1, int [] [] ary2)
    {

        //Top of table formatting

        System.out.println("\nMatrix A+B:");

        //Nested for loop steps through the array and sums each value in the same index position for both arrays. It then prints the sums in table format.

        int x, y;
        int count1 = 0;

        int sum;

        for (x = 0; x <= 2; x++)
        {

            count1 = 0;

            System.out.print("    ");

            for (y = 0; y <= 2; y++)
            {

                count1++;
                sum = ary1 [x] [y] + ary2 [x] [y];

                if (count1 <= 2)
                        System.out.printf("%-5d", sum);
                else

                        System.out.printf("%-5d\n", sum);

            }

        }

    }


}