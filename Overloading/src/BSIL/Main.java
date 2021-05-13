package BSIL;


import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num1 = userInput.nextInt();

        System.out.println("Enter number; ");
        int num2 = userInput.nextInt();

        System.out.println();
        System.out.println(addNums(num1, num2));

        System.out.println();
        System.out.println("Enter number: ");
        double num3 = userInput.nextDouble();

        System.out.println("Enter number; ");
        double num4 = userInput.nextDouble();

        System.out.println();
        System.out.println(addNums(num3, num4));


    }



    public static int addNums (int num1, int num2){
        return num1 + num2;
    }

    public static double addNums (double num1, double num2) {
        return num1 + num2;
    }




}
