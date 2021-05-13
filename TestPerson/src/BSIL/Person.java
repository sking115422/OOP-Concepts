// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   10 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package

public class Person
{

    //Declaring private class variables

    private String name;
    private String address;
    private String phoneNumber;

    Scanner userInput = new Scanner(System.in);         //Creating new scanner object

    //Constructor method to prompt and read user input

    public Person()
    {
        System.out.println("\nFor the " + TestPerson.getObjName() + " object, please enter the following:");
        System.out.println("Name: ");
        name = userInput.nextLine();
        System.out.println("Address: ");
        address = userInput.nextLine();
        System.out.println("Phone number: ");
        phoneNumber = userInput.nextLine();
    }

    ////Getter Methods

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    //ToString method override for Person class

    public String toString ()
    {
        return ("\nPerson object:\t\t\t" + "\n\tName:\t\t\t" + name + "\n\tAddress:\t\t" + address + "\n\tPhone#:\t\t\t" + phoneNumber);
    }


}
