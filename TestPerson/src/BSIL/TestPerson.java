// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   10 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;         //Import all java utilities package

/*
The TestPerson class is designed to create objects and through the created objects test the methods in all other classes in the package then print out the
characteristics of each class for the user.
*/

public class TestPerson
{

    //Declaring private class wide variables

    private static String objName;

    ////Getter method to allow objName to be used outside of class

    public static String getObjName()
    {
        return objName;
    }

    public static void main(String[] args)          //Program main method
    {

        //Welcome prompts

        System.out.println("\nWelcome to the Person Tester!");
        System.out.println("Please follow the prompts below:");

        //Declaring variables for sentinel loop structure

        String quitStatement = "";
        boolean quiteValue = false;

        Scanner userInput = new Scanner(System.in);         //Creating new scanner object

        //Do-while loop to create sentinel loop structure

        do {

            //Creating Person object, assigning object name, and printing object attributes

            objName = "person";
            Person personObj = new Person();
            System.out.println(personObj.toString());

            //Creating Student object, assigning object name, and printing object attributes

            objName = "student";
            Student studentObj = new Student();
            System.out.println(studentObj.toString());

            //Creating Employee object, assigning object name, and printing object attributes

            objName = "employee";
            Employee employeeObj = new Employee();
            System.out.println(employeeObj.toString());

            //Creating Visitor object, assigning object name, and printing object attributes

            objName = "visitor";
            Visitor VisitorObj = new Visitor();
            System.out.println(VisitorObj.toString());

            //Creating Faculty object, assigning object name, and printing object attributes

            objName = "faculty";
            Faculty facultyObj = new Faculty();
            System.out.println(facultyObj.toString());

            //Creating Staff object, assigning object name, and printing object attributes

            objName = "staff";
            Staff staffObj = new Staff();
            System.out.println(staffObj.toString());

            //Sentinel loop prompt

            System.out.println();
            System.out.println("If you wish TO STOP THE PROGRAM please ENTER STOP NOW, otherwise press any key then enter: ");

            //If statement below allows user to loop through until the user enters "stop" ignoring case.

            quitStatement = userInput.next();

            if (quitStatement.equalsIgnoreCase("stop"))
                quiteValue = true;

        }while(!quiteValue);

    }


}
