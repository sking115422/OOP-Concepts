// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   10 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all of java utilities package

public class Student extends Person         //Student class inheriting all of Person class attributes
{

    Scanner userInput = new Scanner(System.in);         //Creating new scanner object

    //Declaring private class variables

    private String status;

    //Constructor method to prompt and read user input

    public Student()
    {
        System.out.println("Status (Freshman, Sophomore, Junior, or Senior): ");

        //Do-while to make sure user inputs are in correct form

        do
        {
            status = userInput.nextLine();

            if (!status.equalsIgnoreCase("Freshman") && !status.equalsIgnoreCase("Sophomore") &&
                    !status.equalsIgnoreCase("Junior") && !status.equalsIgnoreCase("Senior"))
                System.out.println("Invalid status. Please enter Freshman, Sophomore, Junior, or Senior: ");

        }while (!status.equalsIgnoreCase("Freshman") && !status.equalsIgnoreCase("Sophomore") &&
                !status.equalsIgnoreCase("Junior") && !status.equalsIgnoreCase("Senior"));

    }

    //ToString method override for Student class

        public String toString ()
    {
        return ("\nStudent object:\t\t\t" + "\n\tName:\t\t\t" + getName() + "\n\tAddress:\t\t" + getAddress() + "\n\tPhone#:\t\t\t" + getPhoneNumber() +
                "\n\tStatus:\t\t\t" + status);
    }


}
