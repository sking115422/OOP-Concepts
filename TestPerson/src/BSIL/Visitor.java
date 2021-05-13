// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   10 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package

public class Visitor extends Person         //Visitor class inheriting all of Person class attributes
{

    Scanner userInput = new Scanner(System.in);         //Creating new scanner object

    //Declaring private class variables

    private String visitPurpose;
    private Date visitDate = new Date();

    //Constructor method to prompt and read user input

    public Visitor()
    {
        System.out.println("Visit: ");
        visitPurpose = userInput.nextLine();
    }

    //ToString method override for Visitor class

    public String toString ()
    {
        return ("\nVisitor object:\t\t\t" + "\n\tName:\t\t\t" + getName() + "\n\tAddress:\t\t" + getAddress() + "\n\tPhone#:\t\t\t" + getPhoneNumber() +
                "\n\tVisit:\t\t\t" + visitPurpose + "\n\tVisit Date:\t\t" + visitDate);
    }


}
