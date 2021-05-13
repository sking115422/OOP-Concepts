// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   6 - P2
// IDE:          IntelliJ IDEA

package BSIL;


//// *findIndex Method*


public class IndexOfLargest
{

    public static int findIndex(int[] ary1)
    {
        int result;

        int x;
        int largestIndex = 0;
        int max = ary1[0];
        int length = ary1.length;

        //Takes array passed from TestIndexOfLargest and steps through array to find max value then it saves and returns the index value at
        //that position

        for (x = 0; x < length; x = x + 1)
        {

            if (ary1[x] > max)
            {
                max = ary1[x];
                largestIndex = x;
            }

        }

        result = largestIndex;

        return result;

    }

}