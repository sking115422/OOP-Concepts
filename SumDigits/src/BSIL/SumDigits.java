// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   2
// IDE:          IntelliJ IDEA

package BSIL;

import java.util.Scanner; //Import scanner class


//// The SumDigits program is designed to find the sum of the number in the integers of 3 test cases provided by the user.


public class SumDigits {

    public static void main(String[] args) //Program main method
    {

        ////Declarations and Reading/storing inputs from user

        Scanner Value = new Scanner(System.in);     //Creating scanner object
        System.out.println("Please enter an integer 0 - 9999 as a first test value: ");         //Prompting user for input data for "First Test"
        int firstTestValue = Value.nextInt();                                                   //Storing input as declared variable

        System.out.println("Please enter an integer 0 - 9999 as a second test value: ");        //Prompting user for input data for "Second Test"
        int secondTestValue = Value.nextInt();                                                  //Storing input as declared variable

        System.out.println("Please enter an integer 0 - 9999 as a third test value: ");         //Prompting user for input data for "Third Test"
        int thirdTestValue = Value.nextInt();                                                   //Storing input as declared variable


        ////Declarations and Calculations


        //First Test

        int thousandthsPlace = firstTestValue / 1000;       //Declaring variable and storing value for thousands place
            //System.out.println(thousandthsPlace);
        int remainder = firstTestValue % 1000;              //Declaring variable and finding remainder so we can use it to calculate hundreths place value
            //System.out.println(remainder);
        int hundrethsPlace = remainder / 100;               //Declaring variable and calculating and storing value for hundreths place
            //System.out.println(hundrethsPlace);
        remainder = remainder % 100;                        //Finding remainder of first remainder so we can calculate tenths place value
            //System.out.println(remainder);
        int tenthsPlace = remainder / 10;                   //Declaring variable and calculating and storing value for tenths place
            //System.out.println(tenthsPlace);
        remainder = remainder % 10;                         //Finding remainder of second remainder so we can calulate the ones place value
            //System.out.println(remainder);
        int onesPlace = remainder / 1;                      //Declaring variable and calculating and storing the ones place value
            //System.out.println(onesPlace);
        int sumFirstTest = thousandthsPlace + hundrethsPlace + tenthsPlace + onesPlace;       //Declaring variable and computing the sum of all the number places in the integer the user provided for the "First Test"

        //Second Test

        //Second test will follow same logic as first test


        thousandthsPlace = secondTestValue / 1000;
            //System.out.println(thousandthsPlace);
        remainder = secondTestValue % 1000;
            //System.out.println(remainder);
        hundrethsPlace = remainder / 100;
            //System.out.println(hundrethsPlace);
        remainder = remainder % 100;
            //System.out.println(remainder);
        tenthsPlace = remainder / 10;
            //System.out.println(tenthsPlace);
        remainder = remainder % 10;
            //System.out.println(remainder);
        onesPlace = remainder / 1;
            //System.out.println(onesPlace);
        int sumSecondTest = thousandthsPlace + hundrethsPlace + tenthsPlace + onesPlace;

        //Third Test

        //Third test will follow same logic as the first and second

        thousandthsPlace = thirdTestValue / 1000;
        //System.out.println(thousandthsPlace);
        remainder = thirdTestValue % 1000;
        //System.out.println(remainder);
        hundrethsPlace = remainder / 100;
        //System.out.println(hundrethsPlace);
        remainder = remainder % 100;
        //System.out.println(remainder);
        tenthsPlace = remainder / 10;
        //System.out.println(tenthsPlace);
        remainder = remainder % 10;
        //System.out.println(remainder);
        onesPlace = remainder / 1;
        //System.out.println(onesPlace);
        int sumThirdTest = thousandthsPlace + hundrethsPlace + tenthsPlace + onesPlace;


        ////Outputs


        //Below we are printing out the results of the sum digits calculations of the three tests


        System.out.println("\nFirst Test: ");                                               //Header
        System.out.println("\t\t\t\tThe input number is: \t" + firstTestValue);             //Returns string and input number for first test
        System.out.println("\t\t\t\tThe sum of digits is: \t" + sumFirstTest + "\n");       //Returns string and sum of digits for first test

        System.out.println("Second Test:");                                                 //Same logic as first test
        System.out.println("\t\t\t\tThe input number is: \t" + secondTestValue);
        System.out.println("\t\t\t\tThe sum of digits is: \t" + sumSecondTest + "\n");

        System.out.println("Third Test:");                                                  //Same logic as first test and second test
        System.out.println("\t\t\t\tThe input number is: \t" + thirdTestValue);
        System.out.println("\t\t\t\tThe sum of digits is: \t" + sumThirdTest);



    }
}
