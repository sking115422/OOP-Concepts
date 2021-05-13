// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   2 - P1
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.Scanner;       //Import scanner class


//// The IncomeTax program below is designed to take user input of annual income as a postive integer and determine the annual income tax owed as a positive integer based on where income level falls in tax brackets.


public class IncomeTax
{

    public static void main(String[] args)          //Program main method
    {

        ////Asking for user input

        //Using scanner to ask for annual income inputs from user

        System.out.println("Welcome to the Annual Income Tax Calculator!");
        Scanner value = new Scanner(System.in);
        System.out.println("Please enter your annual income as a positive integer: ");


        ////Declarations


        int annualIncome = value.nextInt();
        double annualTax = 0;
        String taxBracket = "";


            ////Calculations

            //Calculations are based on conditional if-then statements


            if (annualIncome <= 30000) {                //If annual income is less than or equal to $30,000, then multiply the user inputted annual income value by tax bracket rate of 3%.
                annualTax = annualIncome * .03;
                taxBracket = "3%";
            }
            else if ((30000 < annualIncome) && (annualIncome <= 70000)){                    //If annual income is greater than min bound (in this case $30,000) and less than or equal to the max bound (in this case $70,000),
                annualTax = 30000 * .03 + (annualIncome - 30000) * .10;                     //Then multiply the user inputted annual income value less the max bound of the previous bracket by tax bracket rate (in this case 10%).
                taxBracket = "10%";                                                         //Then add back the max bound of all previous bracket multiplied by the tax rate for each respective bracket.
            }                                                                               //The total sum will represent the annual tax owed
            else if ((70000 < annualIncome) && (annualIncome <= 150000)){                   //The same logic will hold for all all tax brackets
                annualTax = 30000 * .03 + 40000 * .10 + (annualIncome - 70000) * .15;
                taxBracket = "15%";
            }
            else if ((150000 < annualIncome) && (annualIncome <= 300000)){
                annualTax = 30000 * .03 + 40000 * .10 + 80000 * .15 + (annualIncome - 150000) * .20;
                taxBracket = "20%";
            }
            else if ((300000 < annualIncome) && (annualIncome <= 900000)){
                annualTax = 30000 * .03 + 40000 * .10 + 80000 * .15 + 150000 * .20 + (annualIncome - 300000) * .35;
                taxBracket = "35%";
            }
            else if (900000 < annualIncome){
                annualTax = 30000 * .03 + 40000 * .10 + 80000 * .15 + 150000 * .20 + 600000 * .35 + (annualIncome - 900000) * .40;
                taxBracket = "40%";
            }


        ////Outputs

        //Print outs of income input, tax bracket the income falls in, and tax amount owed.

        System.out.print("\nYour income:\t\t$");
        System.out.println(annualIncome);
        System.out.print("Your tax bracket:\t");
        System.out.println(taxBracket);
        System.out.print("Your tax amount:\t$");
        System.out.print(Math.round(annualTax));
        System.out.println();

    }
}
