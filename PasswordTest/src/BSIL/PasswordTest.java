// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   4 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The PasswordTest program is designed to take an input from the user and turn it into a string. Then, it will test the password against certain rules to determine if
the password is valid or invalid. The password requirements are as follows:

> The password must have at least 7 characters.
> The password must have at least one lower-case letter.
> The password must have at least one upper-case letter.
> The password must have at least one digit.
> The password must have at least one character that is neither a letter nor a digit.
> An example might look like: Cs5000/01

If the inputted password meets all of the criteria listed above then the program will return the password entered and the determination: "Valid Password." If the
password does not meet the requirements the program will return "Invalid Password" and prompt the user to try again until a valid password is inputted.
*/


public class PasswordTest
{

    public static void main(String[] args)          //Program main method
    {


        Scanner userInput = new Scanner(System.in);         //Created scanner

        //User prompt with password specifications

        System.out.println("\nWelcome to the Password Verification Machine. ");
        System.out.println("Please follow the prompts below: ");
        System.out.println("\nThe password requirements are as follows: ");
        System.out.println("> The password must have at least 7 characters.");
        System.out.println("> The password must have at least one lower-case letter.");
        System.out.println("> The password must have at least one upper-case letter.");
        System.out.println("> The password must have at least one digit.");
        System.out.println("> The password must have at least one character that is neither a letter nor a digit.");
        System.out.println("> An example might look like: Cs5000/01 ");
        System.out.println("\nPlease ENTER your PASSWORD HERE:");

        ////Declaration, Initialization, and Reading User Input

        String password = userInput.next();
        int passLength = password.length();
        int counter = 1;

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialCharacter = false;


            /*While loop checks that the password meets all of the conditions specified above. If the password does not the user is
              prompted to enter another password until a valid password is input.*/

            while (passLength < 7 || !upperCase || !lowerCase || !digit || !specialCharacter)
            {
                System.out.print("\nEntered Password:\t");                          //Prompt returning that password is invalid and asking for new password
                System.out.println(password);
                System.out.println("Verdict:\t\t\tInvalid Password");

                System.out.println("\nPlease ENTER another PASSWORD HERE:");

                password = userInput.next();                                        //Reading user input until while loop conditions met
                passLength = password.length();

                //// Calculations

                /*
                The for loop checks each character in the string of the user's entered password against the conditions mentioned above. Once it finds a character that
                satisfies one of the conditions, it turns the boolean variable associate with it true. For example, if one character in the string is a lowercase letter
                it will turn the boolean variable "lowerCase" from false to true. Same logic for "upperCase", "digit", and "specialCharacter".
                */

                for (counter = 0; counter < passLength; counter = counter + 1) {

                    char passCharacter = password.charAt(counter);
                    int charAsNum = passCharacter;


                    if (97 <= charAsNum && charAsNum <= 122)            // 97 through 122 represent the integer values associated with all lower case letters in Java ASCII table
                        lowerCase = true;
                    else if (65 <= charAsNum && charAsNum <= 90)        // 65 through 90 represent the integer values associated with all upper case letters in Java ASCII table
                        upperCase = true;
                    else if (48 <= charAsNum && charAsNum <= 57)        // 48 through 57 represent the integer values associated with all digits 0 to 9 in Java ASCII table
                        digit = true;
                    else
                        specialCharacter = true;                        // Otherwise all other characters the a user can input must be special character in Java ASCII table


                    //          Code to help me step through and debug

                    //                    System.out.println("\n...");
                    //                    System.out.println(lowerCase);
                    //                    System.out.println(upperCase);
                    //                    System.out.println(digit);
                    //                    System.out.println(specialCharacter);

                }

            }

        ////Outputs

        //Returns to the user the entered password followed be the "Valid Password" determination

        System.out.print("\nEntered Password:\t");
        System.out.println(password);
        System.out.println("Verdict:\t\t\tValid Password");


    }
}