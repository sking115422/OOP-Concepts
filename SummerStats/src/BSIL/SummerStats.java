// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   9 - P2
// IDE:          IntelliJ IDEA

package BSIL;

/*
The SummerStats class stores all of the methods the TestSummerStats class calls.
*/

import java.text.*;     //Import all java texts package

public class SummerStats
{

    private int [][] arrayB;        //Only data field is private array

    //Constructor to create HotelRating object

    public SummerStats(int numOfEmp, int years)
    {

        arrayB = new int [numOfEmp] [years];

        int x;
        int y;
        for (x = 0; x < numOfEmp; x++)
        {
            for (y = 0; y < years; y++)
            {
                arrayB[x][y] = (5000 + (int)( Math.random() * 45001));
            }
        }

    }

    //Method that prints out a chart of all of the employee earnings for every employee for all of the specified years.

    public void printSalaries ()
    {
        System.out.println();
        System.out.println();

        int i;
        int j;

        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        fmt.setMaximumFractionDigits(0);

        System.out.printf("%16s", " ");

        for (i = 0; i < arrayB[0].length; i++)
        {
            System.out.printf("%-11s", "Year" + (i + 1));
        }

        System.out.println();

        System.out.print("                ");

        for (i = 0; i < arrayB[0].length; i++)
        {
            System.out.print("-------");

            if (i < arrayB[0].length - 1 )
                System.out.print("----");

        }

        System.out.println();

        for (i = 0; i < arrayB.length; i++)
        {
            System.out.print("Employee: ");
            System.out.print(i + 1 + ":\t");

            for (j = 0; j < arrayB[i].length; j++)
            {
                System.out.printf("%-11s", fmt.format(arrayB [i] [j]));
            }
            System.out.println();
        }
        System.out.println();
    }

    //Method that returns index of the person that made the most money over the years

    public int mostMoney()
    {
        int result = 0;

        int sum;
        int count;
        double average = 0;
        double newAverage;
        int most = 0;

        int i;
        int j;
        for (i = 0; i < arrayB.length; i++)
        {
            sum = 0;
            count = 0;

            for (j = 0; j < arrayB[i].length; j++)
            {
                sum = sum + arrayB[i][j];
                count++;
            }
            newAverage = (double) sum / (double) count;

            if (newAverage > average)
            {
                average = newAverage;
                most = (i + 1);
            }
        }
        result = most;
        return result;

    }

    //Method that returns the index of the year when the highest salary was earned

    public int highestSalaryYear()
    {
        int result;

        int highest = 0;
        int highestInd = 0;

        int i;
        int j;
        for (i = 0; i < arrayB.length; i++)
        {
            for (j = 0; j < arrayB[i].length; j++)
            {
                if (arrayB [i] [j] > highest) {
                    highest = arrayB [i] [j];
                    highestInd = (j + 1);
                }
            }
        }
        result = highestInd;
        return result;

    }

    //Method that returns the total amount of money made by a specific person

    public int totalEarnings(int empInd)
    {
        int result;
        int sum = 0;

        int i = empInd - 1;
        int j;

        for (j = 0; j < arrayB[i].length; j++)
        {
            sum = sum + arrayB [i][j];
        }

        result = sum;
        return result;

    }

    //Method that returns the total amount of money made by all the employees over the years

    public int allEarnings()
    {
        int result;

        int sum = 0;
        int sumRow = 0;

        int i;
        int j;

        for (i = 0; i < arrayB.length; i++)
        {
            for (j = 0; j < arrayB[i].length; j++)
            {
                sumRow = sumRow + arrayB[i][j];
            }
            sum = sum + sumRow;
            sumRow = 0;
        }

        result = sum;
        return result;

    }

    //Method that returns the person who made the highest salary in a given year

    public int highestSalaryPerson(int yearInd)
    {
        int result;
        int highest = 0;
        int highestInd = 0;


        int i;
        int j = yearInd - 1;

        for (i = 0; i < arrayB.length; i++)
        {
            if (arrayB [i] [j] > highest)
            {
                highest = arrayB[i][j];
                highestInd = (i + 1);
            }
        }

        result = highestInd;
        return result;

    }

    //Method that returns a 1D array of the average salary for each year

    public double [] averageSalaryEachYear()
    {
        double [] result = new double [arrayB[0].length];

        double sum;
        double count;
        double average;


        int i;
        int j;
        for (i = 0; i < arrayB[0].length; i++)
        {
            sum = 0;
            count = 0;
            average = 0;

            for (j = 0; j < arrayB.length; j++)
            {
                count++;
                sum = sum + arrayB [j] [i];
            }

            average = sum / count;

            result [i] = average;
        }
        return result;

    }


}
