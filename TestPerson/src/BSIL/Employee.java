// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   10 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.text.*;       //Import all of java text package
import java.util.*;       //Import all of java utilities package

public class Employee extends Person            //Employee class inheriting all of Person class attributes
{

    Scanner userInput = new Scanner(System.in);         //Creating new scanner object

    //Declaring private class variables

    private double salary;
    private Date dateHired = new Date();

    //Constructor method to prompt and read user input

    public Employee()
    {
        System.out.println("Salary: ");
        salary = userInput.nextDouble();
    }

    ////Getter Methods

    public double getSalary()
    {
        return salary;
    }

    public Date getDateHired()
    {
        return dateHired;
    }

    //ToString method override for Employee class

    public String toString ()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        fmt.setMaximumFractionDigits(0);

        return ("\nEmployee object:\t\t\t" + "\n\tName:\t\t\t" + getName() + "\n\tAddress:\t\t" + getAddress() + "\n\tPhone#:\t\t\t" + getPhoneNumber() +
                "\n\tSalary:\t\t\t" + fmt.format(salary) + "\n\tDate Hired:\t\t" + dateHired);
    }


}
