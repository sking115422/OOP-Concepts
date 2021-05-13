// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   9 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;     //Import all java utilities package

/*
The TestHotelRating reads input from the use of how many hotel they want to search and how many years of data they want for each hotel. The class then takes the inputs and calls methods from the HotelRating class to compile
information about the data set. The program the returns to the user the following: the indices of the all the hotels with 5 stars, the average hotel ratings, the indices of all hotels with 4 or more stars, the best hotel, the
worst hotel, and a chart of all the hotels and their rating over the years.
*/

public class TestHotelRating
{

    //Declaring all variables for class a private

    private static int hotelNumber;
    private static int yearNumber;
    private static int x;
    private static int count;

    private static int[] fiveStarIndexArray;

    private static boolean quitValue;

    private static String quitWord;

    public static void main(String[] args)          //Program main method
    {
        Scanner userInput = new Scanner(System.in);         //Creating new scanner object

        //Welcome prompt

        System.out.println("\nWelcome to the Hotel Rating Finder Program!");
        System.out.println();
        System.out.println("Please follow the prompts below:");

        //Do-while provides sentinel loop structure

        do
        {

            //Reading number of hotels from the user

            System.out.println();
            System.out.print("Please enter the number of hotels you are interested in checking: ");

            hotelNumber = userInput.nextInt();

            //Reading number of years from the user

            System.out.println();
            System.out.print("Please enter the number of years you are interested in checking: ");

            yearNumber = userInput.nextInt();

            //Creating new object

            HotelRating hotelRatingObj = new HotelRating(hotelNumber, yearNumber);

            System.out.println();
            System.out.println();
            System.out.print("Five stars hotels indices:\t\t\t\t");

            //Calling method from HotelRating class to return array of indices for all the five star hotels

            fiveStarIndexArray = hotelRatingObj.fiveStarsHotels();

            //Printing the indices for all the five star hotels

            count = 0;
            for (x = 0; x < fiveStarIndexArray.length; x++)
            {
                if (fiveStarIndexArray[x] != 0)
                {
                    count++;

                    if (count != 1)
                        System.out.print(", ");

                    System.out.print(fiveStarIndexArray[x]);

                }

            }

            //Calling method from HotelRating class to print the average hotel ratings

            hotelRatingObj.averageRatings();

            //Calling method from HotelRating class to print the indices of all the 4 and 5 star hotels

            hotelRatingObj.fourOrMoreStars();

            //Calling method from HotelRating class return true if there is a five star hotel and false if there is not.

            System.out.println();
            System.out.print("Any five stars hotel?\t\t\t\t\t");
            System.out.print(hotelRatingObj.anyFiveStars());

            //Calling method from HotelRating class to return the index of the best hotel

            System.out.println();
            System.out.print("Best hotel index:\t\t\t\t\t\t");
            System.out.print(hotelRatingObj.bestHotel());

            //Calling method from HotelRating class to return the index of the worst hotel

            System.out.println();
            System.out.print("Worst hotel index:\t\t\t\t\t\t");
            System.out.print(hotelRatingObj.worstHotel());

            //Calling method from HotelRating class to return a print out of all the hotels and their rating over the years

            hotelRatingObj.printChart();

            //Prompting user to enter "stop" ignoring case if they with to stop the program and to keep going press any key then enter

            System.out.println();
            System.out.print("if you wish TO EXIT THE PROGRAM, ENTER \"STOP\". Otherwise, press any key then enter to rerun: ");


            quitWord = userInput.next();

            if (quitWord.equalsIgnoreCase("stop"))
                quitValue = true;

        }while (!quitValue);
    }

}
