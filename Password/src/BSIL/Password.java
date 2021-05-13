// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   5 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The PasswordTest program is designed to take an input from the user and turn it into a string. Then, it will test the password against certain rules to determine if
the password is valid or invalid. The password requirements are as follows:

> The password must have at least 9 characters.
> The password must contain only letters and digits.
> The password must include at least 3 digits.
> The password must include at least 3 lower-case letters.
> The password must include at least 3 upper-case letters.
> An example might look like: ABCabc123

If the inputted password meets all of the criteria listed above then the program will return the password entered and the determination: "Valid Password." If the
password does not meet the requirements the program will return the password entered and the determination: "Invalid Password." It will then prompt the user to try
again until the user inputs "stop" (ignoring case). This will terminate the program.
*/


public class Password
{


    ////////////////// Program Main Method /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public static void main(String[] args)          //Program main method
    {


        Scanner userInput = new Scanner(System.in);         //Created scanner

        //User prompt with password specifications

        System.out.println("\nWelcome to the Password Verification Machine. ");
        System.out.println("Please follow the prompts below: ");
        System.out.println("\nThe password requirements are as follows: ");
        System.out.println("> The password must have at least 9 characters.");
        System.out.println("> The password must contain only letters and digits.");
        System.out.println("> The password must include at least 3 digits.");
        System.out.println("> The password must include at least 3 lower-case letters.");
        System.out.println("> The password must include at least 3 upper-case letters.");
        System.out.println("> An example might look like: ABCabc123 ");
        System.out.print("\nEnter a password (Enter \"stop\" to exit program): ");


        //Declaring and initializing variable to store user inputted password as string

        String password = "";

        //Do-while loop creating sentinel loop structure to continue processing user input until "stop" (ignoring case) is entered

        do
        {

            password = userInput.next();

            boolean passwordJudgment = CheckPassword(password);


            //If statement terminates loop early once "stop" (ignoring case) is inputted by the user.

            if (password.equalsIgnoreCase("stop" ))
                continue;


            ////Outputs

            //if statement below return entered password string and "Valid Password" if all 5 password requirements are met
            //if statement below return entered password string and "Invalid Password" if all 5 password requirements are not met

            if (passwordJudgment)
            {
                System.out.print("\nEntered Password:\t");
                System.out.println(password);
                System.out.println("Judgement:\t\t\tValid Password");
            }
            else
            {
                System.out.print("\nEntered Password:\t");
                System.out.println(password);
                System.out.println("Judgement:\t\t\tInvalid Password");
            }

            // User prompt to enter password or enter "stop' to exit program

            System.out.print("\nEnter a password (Enter \"stop\" to exit program): ");

            //While-loop will run until "stop" (ignoring case) is entered

        } while(!password.equalsIgnoreCase("stop") );

    }


    ///////////////////// CheckPassword Method ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// //// *Method 1 - CheckPassword*

    //Checks that each of the password requirements are satisfied if so returns true if not returns false

    public static boolean CheckPassword(String password)
    {

        //Declaring and initializing the result of the method

        boolean result = false;

        //Declaring and initializing the boolean variables for 5 test methods for password parameters

        boolean characterMinReq = false;
        boolean lettersAndDigits = false;
        boolean digits_3 = false;
        boolean lowerCase_3 = false;
        boolean upperCase_3 = false;

        //Declaring and initializing all password string related parameters

        int passLength = password.length();
        char passCharacter;
        int charAsNum;

        //Declaring and initializing all counters

        int counter;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        //Using *Method 1* to test if the user input password is greater than or equal to 9 character

        characterMinReq = PassLengthCheck(passLength);

        //For-loop steps through each character in the user entered password to check it against parameters listed above

        for (counter = 0; counter < passLength; counter = counter + 1)
        {

            passCharacter = password.charAt(counter);       //Storing each password variable as character
            charAsNum = passCharacter;                      //Variable saving each password character as integer

            if (LettersAndDigitsCheck(charAsNum))       //Calling *METHOD 2* to tally all letters (uppercase and lowercase) and digits present in user entered password
                a = a + 1;
            if (DigitsCheck(charAsNum))                 //Calling *METHOD 3* to tally all digits present in user entered password
                b = b + 1;
            if (LowerCaseCheck(charAsNum))              //Calling *METHOD 4* to tally all the lowercase letters present in user entered password
                c = c + 1;
            if (UpperCaseCheck(charAsNum))              //Calling *METHOD 5* to tally all the uppercase letters present in user entered password
                d = d + 1;

        }

        if (a == passLength)                //a) If the total number of letters (uppercase and lowercase) and digits equals the total number of characters in the user entered
            lettersAndDigits = true;        //   password then the password entered must be made up of only letters (uppercase and lowercase) and digits
        if (b >= 3)                         //b) If the number of digits is greater or equal to three one of the password rules is satisfied
            digits_3 = true;
        if (c >= 3)                         //c) If the number of lowercase letters is greater or equal to three one of the password rules is satisfied
            lowerCase_3 = true;
        if (d >= 3)                         //d) If the number of uppercase letters is greater or equal to three one of the password rules is satisfied
            upperCase_3 = true;


        if (characterMinReq && lettersAndDigits && digits_3 && lowerCase_3 && upperCase_3)          //If all 5 password requirements are satisfied then method returns true
            result = true;

        return result;

    }


    ///////////////////////////// 5 Boolean Methods /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //// *Method1*

    //Checks that password length is greater than or equal to 9 characters

    public static boolean PassLengthCheck(int num1)
    {
        boolean result = false;
        if (num1 >= 9)
        result = true;
        return result;
    }

    //// *Method 2*

    //Checks that each character in the password is either letters (uppercase and lowercase) or digits and if so returns true

    public static boolean LettersAndDigitsCheck(int num1)
    {
        boolean result = false;
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean digit = false;

        if (97 <= num1 && num1 <= 122)
            lowerCase = true;
        else if (65 <= num1 && num1 <= 90)
            upperCase = true;
        else if (48 <= num1 && num1 <= 57)
            digit = true;


        if (lowerCase || upperCase || digit)
            result = true;

        return result;
    }

    //// *Method 3*

    //Checks that each character in the password is a digit and if so returns true

    public static boolean DigitsCheck(int num1)
    {
        boolean result = false;

        if (48 <= num1 && num1 <= 57)
            result = true;

        return result;
    }

    //// *Method 4*

    //Checks that each character in the password is a lowercase letter and if so returns true

    public static boolean LowerCaseCheck(int num1)
    {
        boolean result = false;

        if (97 <= num1 && num1 <= 122)
            result = true;

        return result;
    }

    //// *Method 5*

    //Checks that each character in the password is an uppercase letter and if so returns true

    public static boolean UpperCaseCheck(int num1)
    {
        boolean result = false;

        if (65 <= num1 && num1 <= 90)
            result = true;

        return result;
    }


}






