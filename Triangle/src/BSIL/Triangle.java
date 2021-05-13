// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   10 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;

/*
The Triangle class store all of the methods necessary to make the test account class function. Including constructors, getter, setter, and other utility methods.
*/

public class Triangle extends GeometricObject       //Inherits all properties from the GeometricObject class
{

    Scanner userInput = new Scanner(System.in);     //Creating new scanner object


    //Declaring and initializing private variables

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    //Constructing an object called triangle with 3 characteristics

    public Triangle (int side1, int side2, int side3)
    {
    }

    //Prompting and reading user input to create object with user input characteristics

    public Triangle ()
    {

        //If statement ensure that the default case is printed and user input is only asked for when dealing with the correct object

        if (TestTriangle.getObjName().equals("inputTriangle"))
        {
            System.out.print("\nPlease enter the length of side 1: ");
            side1 = userInput.nextDouble();
            System.out.print("Please enter the length of side 2: ");
            side2 = userInput.nextDouble();
            System.out.print("Please enter the length of side 3: ");
            side3 = userInput.nextDouble();
            System.out.print("Please enter the color of the triangle: ");
            setColor(userInput.next());
            System.out.print("Please specific if the triangle is filled (true or false): ");
            setFilled(userInput.nextBoolean());
        }

    }

    ////Getter Methods

    //To allow to access value and retrieve value from the Triangle class

    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getSide3()
    {
        return side3;
    }


    ////Other utility Methods

    //getArea uses Heron's formula to find area of the triangle

    public double getArea()
    {
        double s = (side1 + side2 + side3) / 2.0;
        double Area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));

        return Area;
    }

    //getPerimeter adds all the sides of the triangle to find area

    public double getPerimeter()
    {
        return (side1 + side2 + side3);
    }

    //toString overwrites toString method in GeometricObject class and prints out all of the basic object information in the correct format
    //Calls various method from GeometricObject and Triangle class to print all necessary characteristics of each object

    public String toString()
    {
        return ("\nTriangle:\t\t" + TestTriangle.getObjName() + "\nSide 1:\t\t\t" + side1 + "\nSide 2:\t\t\t" + side2 + "\nSide 3:\t\t\t" + side3 + "\nArea:\t\t\t" + getArea() +
                "\nPerimeter:\t\t" + getPerimeter()) + "\nColor:\t\t\t" + getColor() + "\nIs Filled:\t\t" + isFilled();
    }


}

