// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   2 - P4
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.Scanner;       //Import scanner class


////The Cirlces program is designed to take 6 user inputs and use them to determine whether one circle lies completely inside of, outside of, or overlaps with another circle.


public class Circles
{

    public static void main(String[] args)          //Program main method
    {


        ////Declarations and Reading Inputs from user


        System.out.println("Welcome to the Circles Comparison Application!");

        Scanner inputValue = new Scanner(System.in);        //Creating scanner

        System.out.println("Please the x value of the center point (x1) for Circle 1: ");
        int x1 = inputValue.nextInt();                                                                  //Readind input for x value of circle 1 (x1)
        System.out.println("Please the y value of the center point (y1) for Circle 1: ");
        int y1 = inputValue.nextInt();                                                                  //Reading input for y value of circle 1 (y1)
        System.out.println("Please enter the radius of Circle 1");
        int r1 = inputValue.nextInt();                                                                  //Reading input for radius of circle 1 (r1)
        System.out.println("Please the x value of the center point (x2) for Circle 2: ");
        int x2 = inputValue.nextInt();                                                                  //Reading input for x value of circle 2 (x2)
        System.out.println("Please the y value of the center point (y2) for Circle 2: ");
        int y2 = inputValue.nextInt();                                                                  //Reading input for y value of circle 2 (y2)
        System.out.println("Please enter the radius of Circle 2");
        int r2 = inputValue.nextInt();                                                                  //Reading input for radius of circle 2 (r2)

        double midPointDistance = 0;                    //Declaring and initializing mid point variable


        ////Outputs and Calculations

        //Output for summary of user inputted values below

        System.out.println("\nCircle 1 center:\t("+ x1 +", " + y1 + ")");
        System.out.println("Circle 1 radius:\t" + r1);
        System.out.println("Circle 2 center:\t("+ x2 +", " + y2 + ")");
        System.out.println("Circle 2 radius:\t" + r2);

        //Used pythagorean theorem to find mid point distance between two center points

        midPointDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));


            //Now we will compare the radius of circle 1 (r1), the radius of circle 2 (r2), and center point distances to determine what the relationship of the circles is.

            if (midPointDistance > r1 + r2)           //since the mid point distance is greater than the sum of the larger and smaller radii both circles must be completely separated from each other
                {
                System.out.println("Judgement:\t\t\tCircle 2 is completely outside of circle 1");
                }
            else if (r1 > midPointDistance + r2)      //since the bigger radius (r1) is greater than the sum of the mid point distance and smaller radius (r2) the smaller circle (circle 2) must be inside of the larger (Circle 1)
                {
                System.out.println("Judgement:\t\t\tCircle 2 is completely inside of circle 1");
                }
            else if (r2 > midPointDistance + r1)      //since the bigger radius (r2) is greater than the sum of the mid point distance and smaller radius (r1) the smaller circle (circle 1) must be inside of the larger (Circle 2)
                {
                System.out.println("Judgement:\t\t\tCircle 1 is completely inside of circle 2");
                }
            else                                            //All other instance besides the two above must mean that the two circles overlap
                {
                System.out.println("Judgement:\t\t\tCircle 2 is overlapping with circle 1");
                }

            //After if-then determines the condition of the circle the judgment is printed to user

    }
}