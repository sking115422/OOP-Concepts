// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   8 - P2
// IDE:          IntelliJ IDEA

package BSIL;

/*
The Rectangle class store all of the methods necessary to make the test account class function. Including constructors, getter, setter, and other utility methods.
*/

public class Rectangle
{

    //Declaring and initializing private variables

    private double width = 1.00;
    private double height = 1.00;

    //Constructing an object call Rectangle

    public Rectangle ()
    {
    }

    ////Getter Methods

    //To allow to access value and retrieve value from the Rectangle class

    public double getHeight()
    {
        return height;
    }

    public double getWidth()
    {
        return width;
    }

    ////Setter Methods

    //To allow to access and return values to the Rectangle class

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    ////Other utility Methods

    //getArea multiplies width by height to find area

    public double getArea()
    {
        return (width * height);
    }

    //getPerimeter adds all the sides of the rectangle to find area

    public double getPerimeter()
    {
        return (2 * width + 2 * height);
    }

    //toString prints out all of the basic object information in the correct format

    public String toString()
    {
        return ("Rectangle " + TestRectangle.objName + " is " + width + " units wide and " + height + " units high.");
    }


}
