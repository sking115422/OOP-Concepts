// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   9 - P1
// IDE:          IntelliJ IDEA

package BSIL;

/*
The HotelRating class stores all of the methods the TestHotelRating class calls.
*/

public class HotelRating
{

    private int [][] arrayA;        //Only data field is private array

    //Constructor to create HotelRating object

    public HotelRating(int hotels, int years)
    {

        arrayA = new int [hotels][years];

        int x;
        int y;
        for (x = 0; x < hotels; x++)
        {
            for (y = 0; y < years; y++)
            {
                arrayA[x][y] = (1 + (int)( Math.random() * 5));
            }
        }

    }

    //Method to return indices of all 5 star hotels

    public int [] fiveStarsHotels()
    {
        int[] result = new int [arrayA.length];

        int i;
        int j;
        for (i = 0; i < arrayA.length; i++)
        {
            for (j = 0; j < arrayA[i].length; j++)
            {
                if (arrayA[i] [j] == 5)
                {
                    result [i] = i + 1;
                    break;
                }
                else
                    result [i] = 0;
            }
        }
        return result;

    }

    //Method to return average rating for all hotels over all years specified

    public void averageRatings()
    {
        System.out.println();

        System.out.println("Average Ratings Are:");

        int i;
        int j;
        for (i = 0; i < arrayA.length; i++)
        {
            System.out.print("\t\t");
            System.out.print("Hotel ");
            System.out.print(i + 1 + ":\t\t\t\t\t\t");
            
            int sum = 0;
            int count = 0;
            double average = 0;
            
            for (j = 0; j < arrayA[i].length; j++)
            {
                sum = sum + arrayA [i][j];
                count++;
            }
            average = (double) sum / (double) count;

            System.out.printf("%.2f", average);
            System.out.println();
        }
        
    }

    //Method to return indices of all 4 and 5 star hotels

    public void fourOrMoreStars()
    {

        System.out.print("Four or more stars hotels indicies:\t\t");

        int count = 0;
        int i;
        int j;
        for (i = 0; i < arrayA.length; i++)
        {
            for (j = 0; j < arrayA[i].length; j++)
            {
                if (arrayA[i] [j] >= 4)
                {
                    count++;

                    if (count != 1)
                        System.out.print(", ");

                    System.out.print(i + 1);
                    break;
                }
            }
        }

    }

    //Method to return true if there is a five star hotel in the list, if not returns false

    public boolean anyFiveStars()
    {
        boolean result = false;

        int i;
        int j;
        for (i = 0; i < arrayA.length; i++)
        {
            for (j = 0; j < arrayA[i].length; j++)
            {
                if (arrayA[i] [j] == 5)
                {
                    result = true;
                    break;
                }
            }
        }
        return result;

    }

    //Method to return index of the best rated hotel over the years based on average rating

    public int bestHotel()
    {
        int result = 0;

        int sum;
        int count;
        double average = 0;
        double newAverage;
        int best = 0;

        int i;
        int j;
        for (i = 0; i < arrayA.length; i++)
        {
            sum = 0;
            count = 0;

            for (j = 0; j < arrayA[i].length; j++)
            {
                sum = sum + arrayA[i][j];
                count++;
            }
            newAverage = (double) sum / (double) count;

            if (newAverage > average)
            {
                average = newAverage;
                best = (i + 1);
            }
        }
        result = best;
        return result;

    }

    //Method to return index of the worst rated hotel over the years based on average rating

    public int worstHotel()
    {
        int result = 0;

        int sum;
        int count;
        double average = 5;
        double newAverage;
        int worst = 0;

        int i;
        int j;
        for (i = 0; i < arrayA.length; i++)
        {
            sum = 0;
            count = 0;

            for (j = 0; j < arrayA[i].length; j++)
            {
                sum = sum + arrayA[i][j];
                count++;
            }
            newAverage = (double) sum / (double) count;

            if (newAverage < average)
            {
                average = newAverage;
                worst = (i + 1);
            }
        }
        result = worst;
        return result;

    }

    //Method that prints out a chart of all of the ratings for every hotel for all of the specified years.

    public void printChart ()
    {
        System.out.println();
        System.out.println();

        int i;
        int j;

        System.out.println("Ratings Chart: ");
        System.out.println();

        System.out.printf("%12s", " ");

        for (i = 0; i < arrayA[0].length; i++)
        {
            System.out.printf("%-9s", "Year" + (i + 1));
        }

        System.out.println();

        System.out.print("----------");

        for (i = 0; i < arrayA[0].length; i++)
        {
            System.out.print("---------");
        }

        System.out.println();

        for (i = 0; i < arrayA.length; i++)
        {
            System.out.print("Hotel ");
            System.out.print(i + 1 + ":\t");

            for (j = 0; j < arrayA[i].length; j++)
            {
                if (arrayA [i] [j] == 1)
                    System.out.printf("%-9s", "*");
                else if (arrayA [i] [j] == 2)
                    System.out.printf("%-9s", "**");
                else if (arrayA [i] [j] == 3)
                    System.out.printf("%-9s", "***");
                else if (arrayA [i] [j] == 4)
                    System.out.printf("%-9s", "****");
                else
                    System.out.printf("%-9s", "*****");
            }
            System.out.println();
        }
        System.out.println();
    }

}