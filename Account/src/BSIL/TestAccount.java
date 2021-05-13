// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   8 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.text.*;         //Importing all of java text package
import java.util.*;         //Importing all of java utilities package

/*
The TestAccount class is designed to call methods from the Account class in order to allow the user to enter information related to a bank account. They may enter
account ID, balance, annual interest rate, amount to be withdrawn, and amount to be deposited. The program will then print the new account ID, balance, annual
interest rate, monthly interest rate, and monthly interest amount.
*/

public class TestAccount {


    public static void main(String[] args)          //Program main method
    {
        Scanner userInput = new Scanner(System.in);         //Creating new scanner object

        //Declarations and Initializations

        int id;

        double balance;
        double aIT;
        double mIT;
        double withdrawalAmt;
        double depositAmt;

        String quitStatement;

        boolean quiteValue = false;

        //Welcome prompt

        System.out.println("\nWelcome to the Bank Account Manager Program!");
        System.out.println("Below is an example of some information that the program can tell you:");


        ///////// myObject //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        Account myObject = new Account();       //Creating a new Account object

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

            ///////// myAccount //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


            Account myAccount = new Account();      //Creating a new Account object

            //Reading user input a setting each corresponding object value to the user input

            System.out.println();
            System.out.println("For \"myAccount\"");
            System.out.print("Please enter an account ID number: ");
            id = userInput.nextInt();
            myAccount.setId(id);

            System.out.println();
            System.out.print("Please enter an account balance: ");
            balance = userInput.nextDouble();
            myAccount.setBalance(balance);

            System.out.println();
            System.out.print("Please enter the annual interest rate: ");
            aIT = userInput.nextDouble();
            myAccount.setAnnualInterestRate(aIT);

            //Calling method to print out account info

            System.out.println(myAccount.toString());

            //Setting all object values back to default

            myAccount.setId(0);
            myAccount.setBalance(0.0);
            myAccount.setAnnualInterestRate(0.0);


            ///////// yourAccount //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


            Account yourAccount = new Account();        //Creating a new Account object

            //Reading user input a setting each corresponding object value to the user input

            System.out.println();
            System.out.println("For \"yourAccount\"");
            System.out.print("Please enter an account ID number: ");
            id = userInput.nextInt();
            yourAccount.setId(id);

            System.out.println();
            System.out.print("Please enter an account balance: ");
            balance = userInput.nextDouble();
            yourAccount.setBalance(balance);

            System.out.println();
            System.out.print("Please enter the annual interest rate: ");
            aIT = userInput.nextDouble();
            yourAccount.setAnnualInterestRate(aIT);

            System.out.println();
            System.out.println("Do you wish to withdraw or deposit money? If so, please enter a value other than 0 where appropriate.");
            System.out.println();
            System.out.print("Value to withdraw (0 if not desired): ");

            withdrawalAmt = userInput.nextDouble();
            yourAccount.setBalance(yourAccount.withdraw(withdrawalAmt));

            System.out.println();
            System.out.print("Value to deposit (0 if not desired): ");

            depositAmt = userInput.nextDouble();
            yourAccount.setBalance(yourAccount.deposit(depositAmt));

            System.out.println(yourAccount.toString());

            //Calling method for monthly interest rate

            mIT = yourAccount.getMonthlyInterestRate();

            //Formatting numbers to print out correctly as percents with 1 decimal place and also as currency values.

            NumberFormat percentFmt = NumberFormat.getPercentInstance();
            NumberFormat currencyFmt = NumberFormat.getCurrencyInstance();
            percentFmt.setMaximumFractionDigits(1);

            //calling method for monthly interest amount and the printing monthly rate and amount.

            System.out.println();
            System.out.print("Monthly Interest Rate:\t\t\t");
            System.out.println(percentFmt.format(mIT));
            System.out.print("Monthly Interest Amount:\t\t");
            System.out.println(currencyFmt.format(yourAccount.getMonthlyInterest(mIT)));

            //Setting object value back to default

            yourAccount.setId(0);
            yourAccount.setBalance(0.0);
            yourAccount.setAnnualInterestRate(0.0);

            System.out.println();
            System.out.println("If you wish TO STOP THE PROGRAM please ENTER STOP NOW, otherwise press any key then enter: ");

            //If statement below allows user to loop through last two account entries until the enter "stop" ignoring case.

            quitStatement = userInput.next();

                if (quitStatement.equalsIgnoreCase("stop"))
                        quiteValue = true;

        }while(!quiteValue);


    }


}
