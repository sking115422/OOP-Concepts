// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   6 - P3
// IDE:          IntelliJ IDEA

package BSIL;


//// *getValues Method*

/*
This method step through the user inputted array (ary1) and compares each value to every other value in the array then if they are equal breaks
to stop the counter at the corresponding index value. if the two counters are equal then it store the current value in a new array called (ary2)
*/

public class DistinctValues
{

    public static int [] getValues(int[] ary1)
    {
        int [] result;

        int [] ary2 = new int[10];

        int a;
        int b;
        int c = 0;
        int count = 0;

        for (a = 0; a < ary2.length; a = a + 1)
        {

                for (b = 0; b < a; b = b + 1)
                {
                    if (ary1[a] == ary1[b])
                    {
                        break;
                    }
                }

                if (a == b)
                {
                    ary2 [c++] = ary1[a];
                }

        }

        result = ary2;

        return result;

    }

}
