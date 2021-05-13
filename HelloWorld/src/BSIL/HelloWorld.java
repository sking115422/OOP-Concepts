// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   1
// IDE:          IntelliJ IDEA


package BSIL;

import java.util.Scanner; //Import scanner class


////The helloWorld programs is designed to allow the user to input their name or any other string then return the phrase "Hello ...'String' ...!".


public class HelloWorld
{

    public static void main(String[] args) //Program main method
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your name: "); //Prompt user for input
        String name = s.nextLine(); //Read user input
        System.out.println("Hello " + name + "!"); //Print out your message

    }
}