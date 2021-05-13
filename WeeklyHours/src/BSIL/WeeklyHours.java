// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   7 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*
The WeeklyHours program starts by asking the user for an input value to run the code. If user input 1 then the code will run, otherwise the code will terminate. Next the main populates
multi-dimensional array (3 rows 7 columns) with random values from 0 - 10 and prints these inputs to the user in table format. Next the program calls a method called addHours. This method
sums the number of hours worked per week for each of the three employees and prints that value to the user.
*/


public class WeeklyHours
{


    public static void main(String[] args)          //Program main method
    {

        Scanner userInput = new Scanner(System.in);         //Created scanner

        System.out.println("\nWelcome to The Check Weekly Hours Program!");                    // Welcome prompt for user
        System.out.println("Please follow the prompts below: ");

        int contVar = -1;

        System.out.print("\nEnter \"1\" to start or \"0\" to quit program: ");

        //Do-while loop to create sentinel structure for the user. Quite value is 0

        do
        {

            //Reading user input

            contVar = userInput.nextInt();

            if (contVar == 1)
            {

                int[][] randWorkerHours = new int[3][7];      //Declaring array for user input

                //Nested for loops populates array with random values

                int a, b;
                for (a = 0; a <= 2; a++)
                    for (b = 0; b <= 6; b++)
                        randWorkerHours[a][b] = (int) ((Math.random() * 10) + Math.random());

                //Declaring variables for table format

                int c, d;
                int count1 = 0;
                int count2;

                String space = " ";
                String mon = "Mon";
                String tue = "Tue";
                String wed = "Wed";
                String thu = "Thu";
                String fri = "Fri";
                String sat = "Sat";
                String sun = "Sun";

                //Creating table format

                System.out.printf("\n%-13s", space);
                System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s", mon, tue, wed, thu, fri, sat, sun);
                System.out.println();

                //Using nested for loop to step through the array and print each value to the user in table format.

                for (c = 0; c <= 2; c++)
                {

                    count1++;
                    count2 = 0;

                    System.out.print("Employee" + count1);
                    System.out.print("     ");

                    for (d = 0; d <= 6; d++)
                    {

                        count2++;

                        if (count2 <= 6)
                            System.out.printf("%-5d", randWorkerHours[c][d]);
                        else
                            System.out.printf("%-5d\n", randWorkerHours[c][d]);

                    }

                }

                //Calling addHours Method

                addHours(randWorkerHours);

                System.out.print("\nEnter \"1\" to rerun or \"0\" to quit program: ");

            }

            else
                continue;

        //code will run until user enters something other than 1

        }while (contVar == 1);



    }

    //* Method AddHours *

    /*
    This method is passed an array by the main and it sums all the numbers in each row. This sum is also the total number of hours that each employee worked for the week. The
    method then prints the total hours worked for each employee in table format.
    */

    public static void addHours (int [] [] ary1)
    {

        //Top of table formatting

        System.out.println("\nEmployee#     Weekly Hours");
        System.out.println("____________________________");

        //Nested for loop steps through the array and sums all the values in each row. It then prints the sums in table format.

        int x, y;
        int count1;
        int sum;

        for (x = 0; x <= 2; x++)
        {

            count1 = 0;
            sum = 0;

            System.out.print("   ");

            for (y = 0; y <= 6; y++)
            {

                count1++;

                if (count1 <= 6)
                    sum = sum + ary1[x][y];

            }

            System.out.printf("%-15d",(x + 1));
            System.out.printf("%-15d\n",sum);

        }

    }


}