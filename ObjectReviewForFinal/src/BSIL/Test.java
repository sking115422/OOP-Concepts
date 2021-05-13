package BSIL;

import java.util.Scanner;

public class Test
{



    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);

        System.out.println();
        System.out.print("Please enter the number of cars in the list: ");
        int listLength = userInput.nextInt();

        Specifics [] cars = new Specifics [listLength];

        for (int a = 0; a < listLength; a++ )
        {
            cars [a] = new Specifics ();
        }


        System.out.println();
        for (int a = 0; a < listLength; a++ )
            System.out.println(cars [a].toString());


    }



}
