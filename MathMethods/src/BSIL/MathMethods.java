// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   3 - P4
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


//The MathMethods program is designed to examine some of the Math Methods present in Java. Such as absolute value, cosine, sine, tangent, floor value, ceiling value, power function, and square root function


public class MathMethods
{

    public static void main(String[] args)          //Program main method
    {



        Scanner userInput = new Scanner(System.in);         //Created scanner

        //Declared int and float variables

        int integ = 0;
        float flt = 0;

        //PART A: Asked user to input a negative number then we returned the absolute value of that number using a Java Math function

        System.out.print("\nEnter a negative integer number:");
        integ = userInput.nextInt();
        System.out.println("The absolute value of " + integ + " is: " +  Math.abs(integ));

        //PART B: Asked user to input a number representing an angle then we returned the cosine, sine, and tangent of that number using a java Math function

        System.out.print("\nEnter a floating-point number representing an angle:");
        flt = userInput.nextFloat();
        System.out.println("The cosine of this angle is:\t" + Math.cos(flt));
        System.out.println("The sine of this angle is:\t\t" + Math.sin(flt));
        System.out.println("The tangent of this angle is:\t" + Math.tan(flt));

        //PART C: Asked user to input a float number and returned the floor and ceiling value (integer value above and below the inputted value) using a java Math function

        System.out.print("\nEnter a floating-point number:");
        flt = userInput.nextFloat();
        System.out.println("The floor value of " + flt +" is:\t\t" + Math.floor(flt));
        System.out.println("The ceiling value of " + flt +" is:\t" + Math.ceil(flt));

        //PART D; Asked user to input a floating point number as X and as Y. Then computed and returned the value of X raised to the power of Y using a java Math function.

        System.out.print("\nEnter a floating-point number as X:");
        float fltX = userInput.nextFloat();
        System.out.print("Enter a floating-point number as Y:");
        float fltY = userInput.nextFloat();
        System.out.println("The value of X^Y is: " + Math.pow(fltX,fltY));

        //PART E: Asked user to enter and integer and returned the square root of that number using a java math function.

        System.out.print("\nEnter an integer number:");
        integ = userInput.nextInt();
        System.out.println("The square root of " + integ +" is: " + Math.sqrt(integ));



    }


}