// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   10 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.text.*;       //Import all of java text package
import java.util.*;       //Import all of java utilities package

public class Staff extends Employee         //Staff class inheriting all of Person and Employee class attributes
{

    Scanner userInput = new Scanner(System.in);         //Creating new scanner object

    //Declaring private class variables

    private String title;

    //Constructor method to prompt and read user input

    public Staff()
    {
        System.out.println("Title: ");
        title = userInput.nextLine();
    }

    //ToString method override for Staff class

    public String toString ()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        fmt.setMaximumFractionDigits(0);

        return ("\nStaff object:\t\t\t" + "\n\tName:\t\t\t" + getName() + "\n\tAddress:\t\t" + getAddress() + "\n\tPhone#:\t\t\t" + getPhoneNumber() +
                "\n\tSalary:\t\t\t" + fmt.format(getSalary()) + "\n\tDate Hired:\t\t" + getDateHired() + "\n\tTitle:\t\t\t" + title);
    }


}
