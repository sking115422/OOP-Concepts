// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   8 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.text.*;
import java.util.*;       //Import all java utilities package


/*
The Account class store all of the methods necessary to make the test account class function. Including constructors, getter, setter, and other utility methods.
*/


public class Account
{

    //Declaring and initializing private variables

    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;

    private final Date dateCreated = new Date();

    //Constructing an object call account

    public Account()
    {
    }

    ////Getter Methods

    //To allow to access value and retrieve value from the Account class

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    ////Setter Methods

    //To allow to access and return values to the Account class


    public void setId(int id)
    {
        this.id = id;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }


    ////Other utility Methods

    //Get monthlyInterestRate calculates the monthly interest rate based on the annual interest rate

    public double getMonthlyInterestRate ()
    {
        return (annualInterestRate/1200);
    }

    // getMonthlyInterestAmount calculates the monthly interest amount based on the monthly interest rate and the balance

    public double getMonthlyInterest( double mIT )
    {
        return (mIT * balance);
    }

    //Withdraw subtracts value passed from the balance

    public double withdraw(double withdrawalAmt)
    {
        return (balance - withdrawalAmt);
    }

    //Deposit adds value passed to the balance

    public double deposit( double depositAmt )
    {
        return (balance + depositAmt);
    }

    //toString prints out all of the basic object information in the correct format

    public String toString()
    {
        NumberFormat percentFmt = NumberFormat.getPercentInstance();
        NumberFormat currencyFmt = NumberFormat.getCurrencyInstance();
        percentFmt.setMaximumFractionDigits(1);

        return ("\nAccount ID:\t\t\t\t" + id +"\nAccount Balance:\t\t" + currencyFmt.format(balance) + "\nInterest Rate:\t\t\t" + percentFmt.format(annualInterestRate/100) + "\nDate Opened:\t\t\t" + getDateCreated());
    }


}
