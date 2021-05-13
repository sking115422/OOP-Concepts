// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   11 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;         //Importing all of java text package


/*
The OutOfBoundsException class is designed test error handling. In this case we are dealing with type mismatch errors and out of bounds errors. The code wraps
input that may cause an error in a try-catch to test the code then deal with any errors it may produce. Once the errors are caught, a custom error message is printed
to the user, and the user is prompted to re-enter the invalid values until they are input correctly. Once this is done code prints its final message of what
element is at the user inputted index.
*/


public class OutOfBoundsException
{

    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);         //Creating scanner object

        //Declaring variable for sentinel loop

        String quitStatement = "";
        boolean quiteValue2 = false;

        //Declaring array

        int[] array1 = new int[10];

        //Populating array with random numbers between 0 and 100

        for (int x = 0; x < 10; x++)
        {
            array1[x] = (int) (Math.random() * 101);
        }

        //First do-while loop to provide sentinel loop structure

        do
        {

            int quiteValue1 = 1;
            int count2 = 0;

            //Second do-while loop allows user to re-enter values that are giving an error

            do
            {

                if (count2 == 0)
                    System.out.print("\nEnter valid index between 0 and 9: ");

                count2++;

                //Reading user input and wrapping it in a try-catch to deal with bad user input that might cause type mismatch or out of bounds error

                try
                {
                    int index = userInput.nextInt();

                    System.out.println("The element at index " + index + " is " + array1[index]);

                    count2 = 0;

                    quiteValue1 = 2;        //Allows loop to terminate once error has been fixed

                    //Sentinel loop prompt

                    System.out.println();
                    System.out.println("If you wish TO STOP THE PROGRAM please ENTER STOP NOW, otherwise press any key then enter: ");
                }

                catch (InputMismatchException e)
                {
                    System.out.print("Index out of bound, re-enter a valid index: ");
                    userInput.nextLine();       //This resets the scanner values
                }

                catch (IndexOutOfBoundsException e)
                {
                    System.out.print("Index out of bound, re-enter a valid index: ");
                    userInput.nextLine();       //This resets the scanner values
                }


            } while (quiteValue1 == 1);

            //If-then statement allows us to only read user input once first do-while is terminated

            if (quiteValue1 == 2)
            {
                //If statement below allows user to loop through until the user enters "stop" ignoring case.

                quitStatement = userInput.next();

                if (quitStatement.equalsIgnoreCase("stop"))
                    quiteValue2 = true;
            }

        }while (!quiteValue2);

    }


}
