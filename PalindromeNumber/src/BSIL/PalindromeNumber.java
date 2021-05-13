// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   2 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.Scanner;       //Import scanner class


//The PalindromeNumber program is designed to test any 5 digit positive integer to determine whether or not it is a palindrome.


public class PalindromeNumber
{

    public static void main(String[] args)          //Program main method
    {


        ////Declarations and Reading Inputs from user


        System.out.println("Welcome to the Palindrome verifier!");
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Please input a 5 digit positive integer to check if it is a palindrome: ");


        int test = inputValue.nextInt();            //Reading user input
        int place1 = 0;                             //Left most digit in 5 digit number sequence (X _ _ _ _)
        int place2 = 0;                             //2nd left most digit in 5 digit number sequence (_ X _ _ _)
        int place3 = 0;                             //Middle digit in 5 digit number sequence (_ _ X _ _)
        int place4 = 0;                             //4th left most digit in 5 digit number sequence (_ _ _ X _)
        int place5 = 0;                             //Right most value in 5 digit number sequence (_ _ _ _ X)
        int remainder = 0;                          //Remainder variable



            ////Calculations & Outputs

            // ***1*** The idea with these calculations was to first test if the user input had 5 digits, if it does not have 5 digits program return error message and code terminates.
            // ***2*** If the input has five digits then the program will proceed to find the value for each digit left to right of the five digit inputted number.
            // ***3*** It will then compare digit 1 and 5 ( place5 and place1) and digits 2 and 4 (place2 and place4). If both of these comparisons are found to be equivalent then a statement is returned indicating the number is a palindrome.
            // ***4*** If both sets of comparisons mentioned above do not match the program will return a statement saying that the input value is not a palindrome


            //***1***

            if (((test / 10000) < 1) ^ (10 <= (test/10000))){
                System.out.print("\nInput value:\t");                                               //print out value returns inputted number and judgement of invalid input
                System.out.println(test);
                System.out.println("Judgement:\t\tInvalid input, must be 5 digit number.");
                }

            //***2***

            else{
                place1 = test/10000;
                //System.out.println(place1);
                remainder = test % 10000;
                //System.out.println(remainder);
                place2 = remainder/1000;
                //System.out.println(place2);
                remainder = remainder % 1000;
                //System.out.println(remainder);
                place3 = remainder / 100;
                //System.out.println(place3);
                remainder = remainder % 100;
                //System.out.println(remainder);
                place4 = remainder / 10;
                //System.out.println(place4);
                remainder = remainder % 10;
                //System.out.println(remainder);
                place5 = remainder / 1;

                    //***3***

                    if ((place1 == place5) && (place2 == place4)){
                        System.out.print("\nInput value:\t");                                       //print out value returns user input value and judgement of palindrome
                        System.out.println(test);
                        System.out.println("Judgement:\t\tPalindrome");
                        }

                    //***4***

                    else{
                        System.out.print("\nInput value:\t");                                       ////print out value returns user input value and judgement of not palindrome
                        System.out.println(test);
                        System.out.println("Judgement:\t\tNot Palindrome");
                        }


                }



    }
}
