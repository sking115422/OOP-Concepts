// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   10 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.text.*;       //Import all of java text package
import java.util.*;       //Import all of java utilities package

public class Faculty extends Employee       //Faculty class inheriting all of Person and Employee class attributes
{

    Scanner userInput = new Scanner(System.in);         //Creating new scanner object

    //Declaring private class variables

    private String officeNumber;
    private String rank;

    //Constructor method to prompt and read user input

    public Faculty()
    {
        System.out.println("Office number: ");
        officeNumber = userInput.nextLine();

        System.out.println("Rank (Assistant Professor, Associate Professor, or Full Professor): ");

        //Do-while to make sure user inputs are in correct form

        do
        {
            rank = userInput.nextLine();

            if (!rank.equalsIgnoreCase("Assistant Professor") && !rank.equalsIgnoreCase("Associate Professor") &&
                    !rank.equalsIgnoreCase("Full Professor"))
                System.out.println("Invalid status. Please enter Assistant Professor, Associate Professor, or Full Professor: ");

        }while (!rank.equalsIgnoreCase("Assistant Professor") && !rank.equalsIgnoreCase("Associate Professor") &&
                !rank.equalsIgnoreCase("Full Professor"));

    }

    //ToString method override for Faculty class

    public String toString ()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        fmt.setMaximumFractionDigits(0);

        return ("\nFaculty object:\t\t\t" + "\n\tName:\t\t\t" + getName() + "\n\tAddress:\t\t" + getAddress() + "\n\tPhone#:\t\t\t" + getPhoneNumber() +
                "\n\tSalary:\t\t\t" + fmt.format(getSalary()) + "\n\tDate Hired:\t\t" + getDateHired() + "\n\tOffice#:\t\t" + officeNumber +
                "\n\tRank:\t\t\t" + rank);
    }


}
