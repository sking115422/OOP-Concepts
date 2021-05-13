// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   12 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;         //Importing all of java utilities package

/*
The CountAverageGrades class is designed to take input from the user of class size and a grade for each person in the class. The main method then calls a
method called findAverage to calculate the average grade. The program then prints class size, grades entered, and class average for the user. The program also
handles exceptions for both user inputs. For class size, the user can only enter positive integer values or 0. Otherwise, the program returns one of two error
messages depending on the type and asks the user to reenter the input with something valid. For student grades, the user can only enter positive integer values
between 0 and 100. Otherwise, the program returns one of two error messages depending on the type and asks the user to reenter the input with something valid.
*/

public class CountAverageGrades
{

    public static void main(String[] args)          //Program main method
    {
        Scanner userInput = new Scanner(System.in);         //Creating scanner object

        //Declarations and Initializations for the main

        String quitStatement = "";
        boolean quiteValue2 = false;

        int x;
        int classSize = 0;

        //Welcome prompt for the user

        System.out.println("\nWelcome to the Average Grade Calculator!");
        System.out.println("Please follow the prompts, and enter the values requested below.");

        //Do-while to give sentinel structure

        do
        {

            System.out.println();

            //Resetting inner quit value every time user re-runs program

            int quiteValue1 = 1;

            //Do-while to allow the user to re-enter values that were invalid

            do
            {

                //Try-catch to catch any user input errors and return a message to tell them their input is invalid

                try
                {
                    System.out.print("Please enter the class size (single positive integer value required): ");
                    classSize = userInput.nextInt();

                    if (0 > classSize)
                        throw new IllegalArgumentException();       //Throwing our own exception if classSize is negative

                    quiteValue1 = 2;        //If code reaches this point it means user has inputted a correct valid so this will terminate do-while

                }

                //This catch returns a message to the user if input is negative

                catch (IllegalArgumentException e)
                {
                    System.out.println("Input is valid, please enter a whole number greater than 0");
                }

                //This catch returns a message to the user if there is any exception. In this case it will cover both type mismatch and out of bounds errors.

                catch (Exception e)
                {
                    System.out.println("Input is valid, try again using only integer numbers");
                    userInput.nextLine();
                }

            } while (quiteValue1 == 1);

            //Creating new array based on class size

            int [] gradesArray = new int [classSize];

            System.out.println();

            //Do-while to allow the user to re-enter values that were invalid

            do
            {

                //Try-catch to catch any user input errors and return a message to tell them their input is invalid

                try
                {

                System.out.print("Please enter each students grades (positive integer values between 0 and 100 required): ");

                //For-loop to populate the array with input from the user

                for (x = 0; x < gradesArray.length; x++)
                    {
                        gradesArray[x] = userInput.nextInt();       //Reading user input

                        if (gradesArray [x] < 0 || 100 < gradesArray [x])
                            throw new IllegalArgumentException();           //Throwing our own exception if user input is less than 0 or greater than 100

                        quiteValue1 = 3;        //If code reaches this point it means user has inputted a correct valid so this will terminate do-while
                    }
                }

                //This catch returns a message to the user if input is below 0 or above 100.

                catch (IllegalArgumentException e)
                {
                    System.out.println("Input is valid, please enter a whole number between 0 and 100");
                    userInput.nextLine();
                }

                //This catch returns a message to the user if there is any exception. In this case it will cover both type mismatch and out of bounds errors.

                catch (Exception e)
                {
                    System.out.println("Input is valid, please make sure entry is a positive whole number or 0");
                    userInput.nextLine();
                }

            } while (quiteValue1 == 2);

            //Printing out class size, entered grades, and the class average for the user

            System.out.println();
            System.out.println("Class size:\t\t\t" + classSize);
            System.out.print("Entered grades:\t\t");

            for (x = 0; x < gradesArray.length; x++)
            {
                System.out.print(gradesArray[x] + " ");
            }
            System.out.println();
            System.out.print("Class average:\t\t");
            System.out.printf("%.2f", findAverage(gradesArray));        //Calling method to return the average of the grades
            System.out.println();

            //If-then statement allows us to only read user input once first do-whiles are terminated

            if (quiteValue1 == 3)
            {
                //Sentinel loop prompt

                System.out.println();
                System.out.print("If you wish TO STOP THE PROGRAM please ENTER STOP NOW, otherwise press any key then enter: ");

                userInput.nextLine();

                //If statement below allows user to loop through until the user enters "stop" ignoring case

                quitStatement = userInput.nextLine();

                if (quitStatement.equalsIgnoreCase("stop"))
                    quiteValue2 = true;
            }

        }while (!quiteValue2);

    }

    //findAverage calls the sumGrades method to return the sum of the grades. It then computes the average and returns it.

    public static double findAverage (int [] a1)
    {
        return sumGrades(a1, a1.length) / a1.length;
    }

    //sumGrades uses recursion to sum all entered grades then return the sum

    public static double sumGrades (int [] a1, int i)
    {
        if (i == 1)
            return a1 [i - 1];
        else
            return (a1 [i -1] + sumGrades(a1,i -1));        //Method calls itself
    }


}
