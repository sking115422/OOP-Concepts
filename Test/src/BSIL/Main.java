// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   5 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package



public class Main
{

    public static void main(String[] args)          //Program main method
    {

        int control = 0;
        int result = 0;
        int num = 4;

        for (i = 0; i < 10; i++)
        {
            if (control == 0)
            {
                result = result + num;
                control = control + 1;
            }
            else
            {
                result = result - 1;
                control = control - 1;
            }
        }

    }




}
