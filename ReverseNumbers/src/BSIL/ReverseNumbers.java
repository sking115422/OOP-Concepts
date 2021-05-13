// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   12 - P3
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;         //Importing all of java utilities package

/*
The ReverseNumbers class is designed to take input from the user of 5 integers. The main method then calls a recursive method called reverse to invert each integer.
The program then prints the original numbers input by the user and then the inverted ones. The program also handles exceptions for user inputs. For the 5 user
entered numbers, the user can only enter positive integer values or 0. Otherwise, the program returns one of two error messages depending on the type and asks the
user to reenter the input with something valid.
*/

public class ReverseNumbers
{

    public static void main(String[] args)          //Program main method
    {

        Scanner userInput = new Scanner(System.in);         //Creating scanner object

        //Declarations and Initializations for the main

        String quitStatement = "";
        boolean quiteValue2 = false;

        int [] array1 = new int [5];

        int x;

        //Welcome prompt for the user

        System.out.println("\nWelcome to the Reverse Numbers Program!");
        System.out.println("Please follow the prompts, and enter the values requested below.");

        //Do-while to give sentinel structure

        do
        {

            //Resetting inner quit value every time user re-runs program

            int quiteValue1 = 1;

            //Do-while to allow the user to re-enter values that were invalid

            do
            {

                //Try-catch to catch any user input errors and return a message to tell them their input is invalid

                try
                {
                    System.out.println();
                    System.out.print("Please enter 5 positive integer numbers: ");

                    for (x = 0; x < array1.length; x++)
                    {
                        array1[x] = userInput.nextInt();

                        if (array1 [x] <= 0)
                            throw new IllegalArgumentException();       //Throwing our own exception if user input is negative
                    }

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

            //Printing out originally entered numbers and then the reversed ones for the user

            System.out.println();
            System.out.print("Entered numbers:\t");
            for (x = 0; x < array1.length; x++)
                System.out.print(array1[x] + " ");

            System.out.println();
            System.out.print("Reversed numbers:\t");
            for (x = 0; x < array1.length; x++)
            {
                reverse(array1[x]);         //Calling method to print inverted numbers
                System.out.print(" ");
            }
            System.out.println();

            //If-then statement allows us to only read user input once first do-whiles are terminated

            if (quiteValue1 == 2)
            {
                //Sentinel loop prompt

                System.out.println();
                System.out.print("If you wish TO STOP THE PROGRAM please ENTER STOP NOW, otherwise press any key then enter: ");

                userInput.nextLine();

                //If statement below allows user to loop through until the user enters "stop" ignoring case.

                quitStatement = userInput.nextLine();

                if (quitStatement.equalsIgnoreCase("stop"))
                    quiteValue2 = true;
            }

        }while (!quiteValue2);

    }

    //Reverse is a recursive method that prints the inverse of any number it is given

    public static void reverse (int i)
    {

        if (i < 10)
        System.out.print(i);
        else
        {
            System.out.print(i % 10);
            reverse(i / 10);            //Method calls itself
        }

    }


}
