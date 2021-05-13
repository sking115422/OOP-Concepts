// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   10 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;     //Import all java utilities package

/*
The TestTriangle class is designed to create objects and through the created objects test the methods in Class Triangle and GeometricObject then print out the
results for the user.
*/

public class TestTriangle
{

    //Declaring private class wide variable for object names

    private static String objName;

    //Getter method for objName

    public static String getObjName()
    {
        return objName;
    }

    public static void main(String[] args)

    {

        //Declaring variables for sentinel loop structure

        String quitStatement = "";
        boolean quiteValue = false;

        Scanner userInput = new Scanner(System.in);         //Creating new scanner object

        //Welcome user prompt

        System.out.println("\nWelcome to the Triangle Tester!");
        System.out.println();
        System.out.println("Please follow the prompts below:");

        //Creating default triangle object, assign the object name, and printing out all object characteristics

        objName = "defaultTriangle";
        Triangle defaultTriangle = new Triangle();
        System.out.println(defaultTriangle.toString());

        //Do-while loop creates sentinel loop structure

        do {

            //Creating input triangle object, assign the object name, and printing out all object characteristics

            objName = "inputTriangle";
            Triangle inputTriangle = new Triangle();
            System.out.println(inputTriangle.toString());

            System.out.println();
            System.out.println("If you wish TO STOP THE PROGRAM please ENTER STOP NOW, otherwise press any key then enter: ");

            //If statement below allows user to loop through until the user enters "stop" ignoring case.

            quitStatement = userInput.next();

            if (quitStatement.equalsIgnoreCase("stop"))
                quiteValue = true;

        }while(!quiteValue);


    }

}
