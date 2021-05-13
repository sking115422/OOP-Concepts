// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   11 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;         //Importing all of java text package

/*
The MismatchException class is designed test error handling. In this case we are dealing with type mismatch errors the code wraps input that may cause an error
in a try-catch to test the code then deal with any errors it may produce. Once the errors are caught, a custom error message is printed to the user, and the
user is prompted to re-enter the invalid values until they are input correctly. Once this is done, the code prints its final message of grades that were entered
and the student average.
*/

public class MismatchException
{

    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);         //Creating scanner object

        //Declaring variable for sentinel loop

        String quitStatement = "";
        boolean quiteValue2 = false;

        //Declaring array

        int[] inpArray = new int [4];

        //First do-while loop to provide sentinel loop structure

        do
        {

            int quiteValue1 = 1;
            int count2 = 0;

            //Second do-while loop allows user to re-enter values that are giving an error

            do
            {

                if (count2 == 0)
                    System.out.print("\nEnter four grades between 0 and 100: ");

                count2++;

                //Reading user input and wrapping it in a try-catch to deal with bad user input that might cause type mismatch

                try
                {

                    //Populating array with input read from the user

                    for (int x = 0; x < 4; x++)
                    {
                        inpArray[x] = userInput.nextInt();
                    }

                    //Calculating the average for all 4 entries

                    int sum = 0;
                    int count = 0;
                    for (int x = 0; x < 4; x++)
                    {
                        count++;
                        sum = sum + inpArray[x];
                    }

                    double average = (double) sum / (double) count;

                    //Printing out enter grades

                    System.out.print("Entered grades are:\t\t");

                    for (int x = 0; x < 4; x++)
                    {
                        System.out.print(inpArray[x]);
                        if (x != 3)
                            System.out.print(", ");
                    }

                    //Printing student average

                    System.out.println();
                    System.out.print("Student Average:\t\t");
                    System.out.printf("%.2f", average);
                    System.out.println();

                    quiteValue1 = 2;

                    //Sentinel loop prompt

                    System.out.println();
                    System.out.println("If you wish TO STOP THE PROGRAM please ENTER STOP NOW, otherwise press any key then enter: ");

                }

                catch (InputMismatchException e)
                {
                    System.out.print("Incorrect input, re-enter valid grades: ");
                    userInput.nextLine();           //This resets the scanner values
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
