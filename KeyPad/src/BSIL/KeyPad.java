// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   5 - P3
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The KeyPad program is designed to take user input of a phone number and store it as a string. The program will then convert any letters entered by the user to a
phone number made up of only digits. The program will then return to the user their original entry and that entry converted entirely to digits.

The program calls a method named "getNumber" to convert letters to digits.
*/


public class KeyPad
{

    public static void main(String[] args)          //Program main method
    {

        Scanner userInput = new Scanner(System.in);         //Created scanner

        System.out.println("\nWelcome to KeyPad! ");                    // Welcome prompt for user
        System.out.println("Please follow the prompts below: ");
        System.out.println("\nPlease enter a phone number as letters or digits, and the program will return the number as only digits.");
        System.out.println("For example: 770-KSU-CCSE");
        System.out.print("\nEnter phone number (Enter \"stop\" to quit): ");

        ////Declarations

        String phoneNumber;
        String newPhoneNumber;

        int phoneNumberLength;
        int phoneNumberDigit;
        int x;

        char phoneChar;
        char phoneCharLower;

        ////Calculations

        //Do-while loop to provide sentinel structure. User may enter "stop" at any time to terminate program.

        do
        {

            phoneNumber = userInput.nextLine();         //Reading user input

            if (phoneNumber.equalsIgnoreCase("stop"))       //Terminates loop early if "stop" (ignoring case) is entered
                continue;

            phoneNumberLength = phoneNumber.length();           //Finds and stores length of user input string to use as upper bound for for-loop

            newPhoneNumber = "";            //Clearing output string after every run

            //For-loop used to allow us to step through and covert each character in user inputted string

            for (x = 0; x <= phoneNumberLength - 1; x = x + 1)
            {

                phoneChar = phoneNumber.charAt(x);          //Finds each character of original string input by user

                phoneCharLower = phoneNumber.toLowerCase().charAt(x);       //Finds each LOWERCASE character of original string input by user so we can use in getNumber method

                phoneNumberDigit = getNumber(phoneCharLower);           //Calling getNumber method to covert all values to digits in user inputted string if needed.

                //If getNumber method returns zero the original character from the user input string will be added to a new string called "newPhoneNumber"
                //Else (getNumber method returns any value but 0) the converted digit will be added to a new string called "newPhoneNumber"

                if (phoneNumberDigit == 0)
                    newPhoneNumber = newPhoneNumber + phoneChar;
                else
                    newPhoneNumber = newPhoneNumber + phoneNumberDigit;

            }

            ////Outputs

            //Program returns to the user the original string entered and the new string of only digits

            System.out.print("\nYou entered:\t\t");
            System.out.println(phoneNumber);
            System.out.print("Phone number:\t\t");
            System.out.println(newPhoneNumber);

            //User prompt to enter another phone number or quit program by entering "stop" (ignoring case)

            System.out.print("\nEnter phone number (\"stop\" to quit): ");

        } while (!phoneNumber.equalsIgnoreCase("stop"));

    }


    //// *METHOD 1 - getNumber*

    //Takes character value from main and returns integer value for phone number digit based on the international standard letter/number mapping for telephones

    public static int getNumber(char lowercaseLetter)
    {

        int result;


        if ((97 <= lowercaseLetter) && (lowercaseLetter <= 99))
            result = 2;
        else if ((100 <= lowercaseLetter) && (lowercaseLetter <= 102))
            result = 3;
        else if ((103 <= lowercaseLetter) && (lowercaseLetter <= 105))
            result = 4;
        else if ((106 <= lowercaseLetter) && (lowercaseLetter <= 108))
            result = 5;
        else if ((109 <= lowercaseLetter) && (lowercaseLetter <= 111))
            result = 6;
        else if ((112 <= lowercaseLetter) && (lowercaseLetter <= 115))
            result = 7;
        else if ((116 <= lowercaseLetter) && (lowercaseLetter <= 118))
            result = 8;
        else if ((119 <= lowercaseLetter) && (lowercaseLetter <= 122))
            result = 9;
        else
            result = 0;

        return result;

    }

}

