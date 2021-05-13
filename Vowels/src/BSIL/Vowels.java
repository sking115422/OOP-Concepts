// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   12 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;         //Importing all of java utilities package

/*
The Vowels class is designed to take a string from the user. Then, go through that string and count the vowels. Then, return the entered string and number of vowels to the user.
The class uses two methods to achieve this: countVowel and isVowel. The isVowel method determines if a character in the string is a vowel. If so it returns a 1. If not, it returns a 0.
The countVowel uses a recursive structure to step through the string and count the vowels.
*/

public class Vowels
{

    public static void main(String[] args)          //Program main method
    {

        //Welcome prompt for user

        System.out.println();
        System.out.println("Welcome to the Vowel Finder Program!");

        //Declarations and initialization for sentinel do-while loop

        String quitStatement = "";
        boolean quiteValue = false;

        //Do-while loop for sentinel structure

        do
        {

            Scanner userInput = new Scanner(System.in);         //Creating new scanner

            System.out.println();
            System.out.print("Please enter a string: ");

            //Reading string from user

            String s1 = userInput.nextLine();
            int i = s1.length();

            //Printing out string entered and number of vowels for the user

            System.out.println();
            System.out.println("Entered string:\t\t" + s1);
            System.out.println("Number of vowels:\t" + countVowels(s1, i));         //Calling method to return number of vowels

            //Sentinel loop prompt

            System.out.println();
            System.out.println("If you wish TO STOP THE PROGRAM please ENTER STOP NOW, otherwise press any key then enter: ");

            //If statement below allows user to loop through until the user enters "stop" ignoring case.

            quitStatement = userInput.next();

            if (quitStatement.equalsIgnoreCase("stop"))
                quiteValue = true;


        }while (!quiteValue);

    }

    //countVowels method calls isVowel method to recursively go through each character in this string and count number of vowels

    public static int countVowels (String s1, int i)
    {
        if (i == 1)
            return isVowel(s1.charAt(i - 1));
        else
            return isVowel(s1.charAt(i - 1)) + countVowels(s1, i - 1);          //Method calls itself here
    }

    //Is vowel method determines if a character is a vowel. If so, it returns a 1. If not it returns a 0.

    public static int isVowel (char ch)
    {
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return 1;
        else
            return 0;
    }


}
