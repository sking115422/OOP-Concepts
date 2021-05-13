package BSIL;

import java.util.Scanner;

public class FibonacciNumberGenRecursive
{

    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);

        System.out.println();
        System.out.println("This is is the Fibonacci Number Calculator!");

        System.out.println();
        System.out.println("Please enter the number of the term you would like to calculate: ");

        int indexOfSeq = userInput.nextInt();

        System.out.println();

        for (int a = 0; a <= (indexOfSeq - 1); a++)
            System.out.print(FibNum(a) + " ");

        System.out.println();

    }


    public static int FibNum (int x)
    {
        if (x == 0)
        {
            return 0;
        }
        else if (x == 1 || x == 2)
        {
            return 1;
        }
        else
        {
            return FibNum(x - 2) + FibNum(x - 1);
        }
    }



}
