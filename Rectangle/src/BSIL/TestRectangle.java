// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   8 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;     //Import all java utilities package

/*
The TestRectangle class is designed to call methods from the Account class in order to allow the user to enter information related to rectangles. They may enter
width and height. The program will then calculate area and perimeter and print this information for the user.
*/

public class TestRectangle
{

    public static String objName;

    public static void main(String[] args)      //Program main method
    {

        //Declarations and Initializations

        String quitStatement = "";
        boolean quiteValue = false;

        Scanner userInput = new Scanner(System.in);         //Creating new scanner object

        //Welcome prompt

        System.out.println();
        System.out.println("Welcome to the Test Rectangle Program!");
        System.out.println("Please follow the prompts below:");

        System.out.println();
        System.out.println("Below is a sample of what the program tests for. It shows the default values.");

        ///////// myRectangle //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Rectangle myRectangle = new Rectangle();        //Creating a new Rectangle object

        objName = "myRectangle";

        System.out.println();
        System.out.println(myRectangle.toString());

        //Getting default value from class Rectangle and printing them out

        System.out.println();
        System.out.println(objName + ":");
        System.out.println("------------");
        System.out.print("Width:\t\t");
        System.out.printf("%.2f\n", myRectangle.getWidth());
        System.out.print("Height:\t\t");
        System.out.printf("%.2f\n", myRectangle.getHeight());

        //Calling methods to find area and perimeter then printing them out

        System.out.print("Area:\t\t");
        System.out.printf("%.2f\n", myRectangle.getArea());
        System.out.print("Perimeter:\t");
        System.out.printf("%.2f\n",myRectangle.getPerimeter());


        ///////// myRectangle //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        do {

            System.out.println();
            System.out.println("To test hisRectangle,");

            Rectangle hisRectangle = new Rectangle();       //Creating a new Rectangle object

            objName = "hisRectangle";

            //Reading user input and overwriting class rectangle default values

            System.out.print("Please enter the width of the rectangle: ");
            hisRectangle.setWidth(userInput.nextDouble());

            System.out.println();
            System.out.print("Please enter the height of the rectangle: ");
            hisRectangle.setHeight(userInput.nextDouble());

            //Calling toString method to print out string of information about rectangle attributes

            System.out.println();
            System.out.println(hisRectangle.toString());

            //Getting newly set value from class Rectangle and printing them out

            System.out.println();
            System.out.println(objName + ":");
            System.out.println("------------");
            System.out.print("Width:\t\t");
            System.out.printf("%.2f\n", hisRectangle.getWidth());
            System.out.print("Height:\t\t");
            System.out.printf("%.2f\n", hisRectangle.getHeight());

            //Calling methods to find area and perimeter then printing them out

            System.out.print("Area:\t\t");
            System.out.printf("%.2f\n", hisRectangle.getArea());
            System.out.print("Perimeter:\t");
            System.out.printf("%.2f\n", hisRectangle.getPerimeter());

            //Resetting Rectangle class variable to default for next pass of loop

            hisRectangle.setWidth(1.00);
            hisRectangle.setHeight(1.00);

            ///////// myRectangle //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            System.out.println();
            System.out.println("To test herRectangle,");

            Rectangle herRectangle = new Rectangle();       //Creating a new Rectangle object

            objName = "herRectangle";

            //Reading user input and overwriting class rectangle default values

            System.out.print("Please enter the width of the rectangle: ");
            herRectangle.setWidth(userInput.nextDouble());

            System.out.println();
            System.out.print("Please enter the height of the rectangle: ");
            herRectangle.setHeight(userInput.nextDouble());

            //Calling toString method to print out string of information about rectangle attributes


            System.out.println();
            System.out.println(herRectangle.toString());

            //Getting newly set value from class Rectangle and printing them out

            System.out.println();
            System.out.println(objName + ":");
            System.out.println("------------");
            System.out.print("Width:\t\t");
            System.out.printf("%.2f\n", herRectangle.getWidth());
            System.out.print("Height:\t\t");
            System.out.printf("%.2f\n", herRectangle.getHeight());

            //Calling methods to find area and perimeter then printing them out

            System.out.print("Area:\t\t");
            System.out.printf("%.2f\n", herRectangle.getArea());
            System.out.print("Perimeter:\t");
            System.out.printf("%.2f\n", herRectangle.getPerimeter());

            //Resetting Rectangle class variable to default for next pass of loop

            herRectangle.setWidth(1.00);
            herRectangle.setHeight(1.00);



            System.out.println();
            System.out.println("If you wish TO STOP THE PROGRAM please ENTER STOP NOW, otherwise press any key then enter: ");

            //If statement below allows user to loop through last two account entries until the enter "stop" ignoring case.

            quitStatement = userInput.next();

            if (quitStatement.equalsIgnoreCase("stop"))
                quiteValue = true;

        }while(!quiteValue);

    }

}
