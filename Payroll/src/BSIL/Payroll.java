// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   3 - P3
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.*;       //Import all java utilities package


/*The Payroll program takes input from the user (employee name, weekly hours worked, hourly pay rate, federal tax rate, and state tax rate). The program then take that information and
computes the gross weekly pay, amount the federal government will withhold per check, amount the state government will withhold per check, and net pay. Then the program return all of
this information in a concise report labeled "Payroll statement"
*/



public class Payroll
{

    public static void main(String[] args)          //Program main method
    {


        ////Declarations and Reading Inputs from user


        System.out.println("Welcome to the Payroll Generator!");        //Welcome statement

        Scanner userInput = new Scanner(System.in);         //Creating scanner

        //Reading inputs from the user declaring them as variables

        System.out.println("Enter employee's name:");
        String employeeName = userInput.nextLine();
        System.out.println("Enter weekly hours worked:");
        int hoursWorked = userInput.nextInt();
        System.out.println("Enter hourly pay rate:");
        float payRate = userInput.nextFloat();
        System.out.println("Enter federal tax rate:");
        float fedTaxRate = userInput.nextFloat();
        System.out.println("Enter state tax rate:");
        float stateTaxRate = userInput.nextFloat();

        //Declaring output variables and initializing them with the calculations directly

        double grossPay = hoursWorked * payRate;
        double fedWithholding = grossPay * fedTaxRate;
        double stateWithholding = grossPay * stateTaxRate;
        double netPay = grossPay - fedWithholding - stateWithholding;

        //Printing out payroll statement

        System.out.println("\nPayroll Statement");
        System.out.println("=================");
        System.out.print("Employee Name:\t\t\t");
        System.out.println(employeeName);
        System.out.print("Hours Worked:\t\t\t");
        System.out.println(hoursWorked);
        System.out.printf("Pay Rate (per Hour):\t$%.2f\n", payRate);        //using printf function to format as floating point number with 2 decimal places and $ sign so we format as currency
        System.out.printf("Gross Weekly Pay:\t\t$%.2f\n", grossPay);
        System.out.printf("Federal Withholding:\t$%.2f\n", fedWithholding);
        System.out.printf("State Withholding:\t\t$%.2f\n", stateWithholding);
        System.out.printf("Net Pay:\t\t\t\t$%.2f\n", netPay);


    }


}