// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   11 - P3
// IDE:          IntelliJ IDEA

package BSIL;

import java.text.*;         //Importing all of java text package
import java.util.*;         //Importing all of java utilities package

/*
The ModifiedTestAccount class is designed to call methods from the Account class in order to allow the user to enter information related to a bank account. They may enter
account ID, balance, annual interest rate, amount to be withdrawn, and amount to be deposited. The program will then print the new account ID, balance, annual
interest rate, monthly interest rate, and monthly interest amount.

The modified part of this class is the we are now throwing exceptions if balance, annual interest
rate, withdrawn amount, or deposited amount are negative. The exceptions will be thrown inside of a try-catch to deal with the errors and provide a custom error
message. There is also a separate exception class to make things cleaner and more organized.
*/

public class ModifiedTestAccount
{
    
    public static void main(String[] args)          //Program main method
    {
        Scanner userInput = new Scanner(System.in);         //Creating new scanner object

        //Declarations and Initializations

        int id;

        double balance = 0;
        double aIT = 0;
        double mIT;
        double withdrawalAmt;
        double depositAmt;

        String quitStatement;

        boolean quiteValue = false;

        //Welcome prompt

        System.out.println("\nWelcome to the Bank Account Manager Program!");
        System.out.println("Below is an example of some information that the program can tell you:");


        ///////// myObject //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        ModifiedAccount myObject = new ModifiedAccount();       //Creating a new Account object

        //Setting values for first object

        myObject.setId(123456);
        myObject.setBalance(10000);
        myObject.setAnnualInterestRate(2.5);

        //Initializing first withdrawal and deposit values

        withdrawalAmt = 3500;
        depositAmt = 500;

        //Calling with withdrawal and deposit methods the setting the returned values

        myObject.setBalance(myObject.withdraw(withdrawalAmt));
        myObject.setBalance(myObject.deposit(depositAmt));

        //Calling method to string to print out ID, account balance, interest rate, and date opened

        System.out.println(myObject.toString());

        //Setting my object values back to default

        myObject.setId(0);
        myObject.setBalance(0.0);
        myObject.setAnnualInterestRate(0.0);


        System.out.println("\nPlease follow the prompts below to make two other accounts:");

        //Looping through object that require user input. Quit value is "stop" ignoring case.

        do
        {
            ///////// yourAccount /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ModifiedAccount yourAccount = new ModifiedAccount();        //Creating a new Account object

            yourAccount.setBalance(0);
            yourAccount.setAnnualInterestRate(0);
            withdrawalAmt = 0;
            depositAmt = 0;

            //Reading user input a setting each corresponding object value to the user input

            System.out.println();
            System.out.println("For \"yourAccount\"");
            System.out.print("Please enter an account ID number (only zero or positive numbers): ");
            id = userInput.nextInt();
            yourAccount.setId(id);

            //Reading user input is wrapped in try catch method in case the user enters a number below zero. It will then return custom error message.

            try
            {
                System.out.println();
                System.out.print("Please enter an account balance (only zero or positive numbers): ");
                balance = userInput.nextDouble();
                yourAccount.setBalance(balance);

                //Reading user input is wrapped in try catch method in case the user enters a number below zero. It will then return custom error message.

                System.out.println();
                System.out.print("Please enter the annual interest rate (only zero or positive numbers entered as a number not decimal ie. 3 for 3%): ");
                aIT = userInput.nextDouble();
                yourAccount.setAnnualInterestRate(aIT);

                System.out.println();
                System.out.println("Do you wish to withdraw or deposit money? If so, please enter a value other than 0 where appropriate.");

                //Reading user input is wrapped in try catch method in case the user enters a number below zero. It will then return custom error message.

                System.out.println();
                System.out.print("Value to withdraw (0 if not desired, otherwise, only positive numbers): ");
                withdrawalAmt = userInput.nextDouble();
                yourAccount.setBalance(yourAccount.withdraw(withdrawalAmt));

                //Reading user input is wrapped in try catch method in case the user enters a number below zero. It will then return custom error message.

                System.out.println();
                System.out.print("Value to deposit (0 if not desired, otherwise, only positive numbers): ");

                depositAmt = userInput.nextDouble();
                yourAccount.setBalance(yourAccount.deposit(depositAmt));

            } catch (IllegalArgumentException e)
            {
                System.out.println("Invalid Input: " + e.getMessage());         //Using getMessage to call error message from ModifiedAccount class
            }

            if (balance >= 0 && aIT >= 0 && depositAmt >= 0 && withdrawalAmt >= 0)
                System.out.println(yourAccount.toString());

            //Calling method for monthly interest rate

            mIT = yourAccount.getMonthlyInterestRate();

            //Formatting numbers to print out correctly as percents with 1 decimal place and also as currency values.

            NumberFormat percentFmt = NumberFormat.getPercentInstance();
            NumberFormat currencyFmt = NumberFormat.getCurrencyInstance();
            percentFmt.setMaximumFractionDigits(1);

            //calling method for monthly interest amount and the printing monthly rate and amount.

            if (balance >= 0 && aIT >= 0 && depositAmt >= 0 && withdrawalAmt >= 0)
            {
                System.out.println();
                System.out.print("Monthly Interest Rate:\t\t\t");
                System.out.println(percentFmt.format(mIT));
                System.out.print("Monthly Interest Amount:\t\t");
                System.out.println(currencyFmt.format(yourAccount.getMonthlyInterest(mIT)));
            }

            //Setting object value back to default

            yourAccount.setId(0);
            yourAccount.setBalance(0.0);
            yourAccount.setAnnualInterestRate(0.0);

            System.out.println();
            System.out.println("If you wish TO STOP THE PROGRAM please ENTER STOP NOW, otherwise TO RERUN PRESS ANY KEY then ENTER: ");

            //If statement below allows user to loop through last two account entries until the enter "stop" ignoring case.

            quitStatement = userInput.next();

            if (quitStatement.equalsIgnoreCase("stop"))
                quiteValue = true;

        }while(!quiteValue);

    }


}
