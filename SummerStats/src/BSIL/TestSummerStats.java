// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   9 - P2
// IDE:          IntelliJ IDEA

package BSIL;

import java.text.*;     //Import all java texts package
import java.util.*;     //Import all java utilities package

/*
The TestSummerStats calls methods stored in the SummerStats class and formats and prints the following: a chart of each employees salary over the years, which employee
has made the most money over the years, total amount of money made by a specific employee of the user's choice, total earnings by all the employees, employee with the
highest salary in a given year, and the average salary of all years.
*/

public class TestSummerStats
{

    private static int numOfEmp;
    private static int yearNumber;
    private static int totEmpSal;
    private static int yearInd;
    private static int x;

    private static double [] salaryAry;

    private static boolean quitValue;

    private static String quitWord;

    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);         //Creating new scanner object


        //Welcome prompt


        System.out.println("\nWelcome to the Summer Job Stats Program!");
        System.out.println();
        System.out.println("Please follow the prompts below:");


        //Do-while loop to provide sentinel loop structure


        do
        {
            //Reading number of employees from the user


            System.out.println();
            System.out.print("Please enter the number of employees you are interested in checking: ");

            numOfEmp = userInput.nextInt();


            //Reading number of years from the user


            System.out.println();
            System.out.print("Please enter the number of years you are interested in checking: ");

            yearNumber = userInput.nextInt();


            //Creating new object


            SummerStats summerStatsObj = new SummerStats(numOfEmp, yearNumber);

            System.out.println();
            System.out.println();
            System.out.print("Employee Data: ");


            //Calling method to print a chart of all employees salaries over the years


            summerStatsObj.printSalaries();


            //Calling method to print out which employee made the most money over the years


            System.out.println("Employee" + summerStatsObj.mostMoney() + " made the most money over the years.");


            //Calling method to print which year the highest salary was made in


            System.out.println("Highest salary was made in Year" + summerStatsObj.highestSalaryYear() + ".");

            System.out.println();


            //Do-while loop used to prevent the user from inputting a nonsensical value


            do
            {
                //Asking for user input for employee number to compute total salary

                System.out.println("Please enter the number of the employee whose total salary you would like to compute (***must be less than or equal to total number of employees***). ");
                System.out.print("Enter here: ");
                totEmpSal = userInput.nextInt();
            }while (totEmpSal > numOfEmp || totEmpSal <= 0);


            //Formatting number to output currency with no decimal places


            NumberFormat fmt = NumberFormat.getCurrencyInstance();
            fmt.setMaximumFractionDigits(0);


            //Calling method to print out the total earned by user specified employee


            System.out.println();
            System.out.println("Total earned by employee" + totEmpSal + " is " + fmt.format(summerStatsObj.totalEarnings(totEmpSal)));


            //Calling method to print out the total earned by all employees


            System.out.println();
            System.out.println("Total earned by all employees is " + fmt.format(summerStatsObj.allEarnings()));
            System.out.println();


            //Do-while loop used to prevent the user from inputting a nonsensical value


            do
            {
                //Asking for user input for year number to find highest employee salary

                System.out.println("Please enter the number of the year for which you would like to find the highest employee salary (***must be less than or equal to total number of years***). ");
                System.out.print("Enter here: ");
                yearInd = userInput.nextInt();
            }while(yearInd > yearNumber || yearInd <= 0);


            //Calling method to print out which employee earn the highest salary in the user specified year


            System.out.println();
            System.out.println("In year" + yearInd + ", Employee" + summerStatsObj.highestSalaryPerson(yearInd) + " has the highest salary.");


            //Calling method to print out which employee earn the highest salary in the user specified year


            System.out.println();
            System.out.println("The average salary for each year: ");

            salaryAry = summerStatsObj.averageSalaryEachYear();

            System.out.println();
            System.out.printf("%8s", " ");

            for (x = 0; x < summerStatsObj.averageSalaryEachYear().length; x++)
                System.out.printf("%-15s", "Year" + (x + 1));

            System.out.println();

            System.out.print("        ");

            for (x = 0; x < salaryAry.length; x++)
            {
                System.out.print("----------");

                if (x < salaryAry.length - 1)
                    System.out.print("-----");
            }

            NumberFormat fmt2 = NumberFormat.getCurrencyInstance();
            fmt2.setMaximumFractionDigits(2);

            System.out.println();
            System.out.printf("%8s", " ");
            for (x = 0; x < salaryAry.length; x++)
                System.out.printf("%-15s", fmt2.format(salaryAry[x]));

            System.out.println();


            //Prompting user to enter "stop" ignoring case if they with to stop the program and to keep going press any key then enter


            System.out.println();
            System.out.println();
            System.out.print("if you wish TO EXIT THE PROGRAM, ENTER \"STOP\". Otherwise, press any key then enter to rerun: ");


            quitWord = userInput.next();
            System.out.println();

            if (quitWord.equalsIgnoreCase("stop"))
                quitValue = true;

        }while (!quitValue);

    }


}
