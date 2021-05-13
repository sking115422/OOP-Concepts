// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   3 - P1
// IDE:          IntelliJ IDEA


package BSIL;

import java.util.*;         //Importing java utility package

public class StringMethods
{

    public static void main(String[] args)          //Program main method
    {

        Scanner userInput = new Scanner(System.in);         //Creating scanner

        //Reading user inputs and declaring as string

        System.out.println("Please enter a statement (Ex. \"I like pie\"') ");
        String string_1 = userInput.nextLine();
        System.out.println("Please enter a statement (Ex. \"Cats are cool\"') ");
        String string_2 = userInput.nextLine();

        //PART A: Determining length of string_1

        System.out.print("\na) Length of String 1:\t\t");
        System.out.print(string_1.length());
        System.out.println(" characters");

        //PART B: Determining length of string_2

        System.out.print("b) Length of String 2:\t\t");
        System.out.print(string_2.length());
        System.out.println(" characters");

        //PART C: Concatenation of string_1 and string_2

        System.out.print("c) Concatenation:\t\t\t");
        System.out.println(string_1 + " " + string_2);

        //PART D: Determining if strings are equal

        System.out.print("d) Equal Strings?\t\t\t");

        if ( string_1.equals(string_2) == false)        //Used if-then statement to match formatting for the output //false > Not equal //true > Equals
            System.out.println("Not equal");
        else
            System.out.println("Equal");

        //PART E: Converting string_1 to all uppercase letters

        System.out.print("e) Uppercase String 1:\t\t");
        System.out.println(string_1.toUpperCase());

        //PART F: Converting string_2 to all lowercase letters

        System.out.print("f) Lowercase String 2:\t\t");
        System.out.println(string_2.toLowerCase());

        //PART G: Creating a substring from index 1 to 3

        System.out.print("g) Valid substring:\t\t\t");
        System.out.println(string_1.substring(1,3));


    }
}
