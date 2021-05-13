// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   3 - P2
// IDE:          IntelliJ IDEA


package BSIL;

import java.util.*;

public class RandomNumbers
{

    public static void main(String[] args)          //Program main method
    {

        //PART A: used random number generator to generate value between 20 and 80 (inclusive)

        int a = 20 + (int)(Math.random() * 61);
        System.out.print("\na) A random integer between 20 and 80 (inclusive):\t\t\t");
        System.out.println(a);

        //PART B: used random number generator to generate value between -20 and 20 (inclusive)

        int b = (int)(-21 * Math.random()) + (int)(21 * Math.random());
        System.out.print("b) A random integer between -20 and 20 (inclusive):\t\t\t");
        System.out.println(b);

        //PART C: used random number generator to generate value between -50 and -20 (inclusive)

        int c = (int)(-50 + (31 * Math.random()));
        System.out.print("c) A random integer between -50 and -20 (inclusive):\t\t");
        System.out.println(c);

        //PART D: used random number generator to generate value between 0.0 and 21.9999 (inclusive)

        float d = (float)Math.random() * 22;
        System.out.print("d) A random integer between 0.0 and 21.9999 (inclusive):\t");
        System.out.println(d);


    }

}
