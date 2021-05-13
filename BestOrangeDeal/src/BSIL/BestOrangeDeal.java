// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   2 - P3
// IDE:          IntelliJ IDEA


package BSIL;

import java.util.Scanner;       //Import scanner class


//// The BestOrangeDeal program is designed to take 4 piece of information from the user (small box weight, small box price, large box weight, large box price)
//// and convert to a price per lb for large and small boxes. The program then compares small and large boxes to find the better deal or if the deals are equal.


public class BestOrangeDeal
{

    public static void main(String[] args)          //Program main method
    {

        ////Declarations and Reading Inputs from user


        System.out.println("Welcome to The Best Orange Deal Finder Application!");

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Please input the weight in pounds of the small box: ");
        float smallBoxWeight = inputValue.nextFloat();                                      //Reading user input of small box weight
        System.out.println("Please input the price in dollars of the small box: ");
        float smallBoxPrice = inputValue.nextFloat();                                       //Reading user input of small box price
        System.out.println("Please input the weight in pounds of the large box: ");
        float largeBoxWeight = inputValue.nextFloat();                                      //Reading user input of large box weight
        System.out.println("Please input the price in dollars of the large box: ");
        float largeBoxPrice = inputValue.nextFloat();                                       //Reading user input of large box price


        ////Calculations

        //Price of each box is divided by weight below to give a price per lb for comparison of both boxes

        float smallPricePerLb = (smallBoxPrice/smallBoxWeight);
        float largePricePerLb = (largeBoxPrice/largeBoxWeight);



        ////First Set of Outputs

        //User inputs are summarized and printed below

        System.out.print("\nSmall box weight:\t");
        System.out.print(Math.round(smallBoxWeight));
        System.out.println(" Pounds");
        System.out.print("Small box price:\t");
        System.out.print(Math.round(smallBoxPrice));
        System.out.println(" Dollars");
        System.out.print("Large box weight:\t");
        System.out.print(Math.round(largeBoxWeight));
        System.out.println(" Pounds");
        System.out.print("Large box price:\t");
        System.out.print(Math.round(largeBoxPrice));
        System.out.println(" Dollars");


            ////Second Outputs

            //Price per pound of the small and large boxes are compared below then a determination is made and printed for which is a better deal or if they are equal.

            if (smallPricePerLb < largePricePerLb)
                {
                System.out.println("Judgment:\t\t\tThe smaller box is a better deal");
                }
            else if (smallPricePerLb > largePricePerLb)
                {
                System.out.println("Judgment:\t\t\tThe larger box is a better deal");
                }
            else if (smallPricePerLb == largePricePerLb)
                {
                System.out.println("Judgment:\t\t\tBoth boxes are of the same value");
                }


    }

}