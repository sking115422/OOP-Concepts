// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   5 - P2
// IDE:          IntelliJ IDEA

package BSIL;

public class MyRectangle {

    //// *METHOD isValid*

    //This method asks for input of width and height from TestMyRectangle. It then returns true if width + height > 30.

    public static boolean isValid(double width, double height)
    {
        boolean result = false;
        if ((width + height) > 30)
            result = true;
        return result;
    }

    //// *METHOD Area*

    //This method asks for input of width and height from TestMyRectangle. It then calls isValid method. If is valid method is true, it computes and returns the area.

    public static double Area(double width, double height)
    {
        double result = 0;
        boolean valid = isValid(width, height);

        if (valid)
            result = (width * height);

        return result;
    }

    //// *METHOD Perimeter*

    //This method asks for input of width and height from TestMyRectangle. It then calls isValid method. If is valid method is true, it computes and returns the Perimeter.

    public static double Perimeter(double width, double height)
    {
        double result = 0;
        boolean valid = isValid(width, height);

        if (valid)
            result = (2 * width + 2 * height);

        return result;
    }

}