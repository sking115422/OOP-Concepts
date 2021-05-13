package BSIL;



import java.text.NumberFormat;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {


        double a = ((Math.random() * 10 ) + Math.random());
        double b = ((Math.random() * 10 ) + Math.random());
        double c = ((Math.random() * 10 ) + Math.random());
        double d = ((Math.random() * 10 ) + Math.random());
        double e = ((Math.random() * 10 ) + Math.random());

        System.out.printf("\nRow1:%10.2f %10.2f", a, b);
        System.out.println();
        System.out.printf("Row2:%10.2f %10.2f", b, c);
        System.out.println();
        System.out.printf("Row3:%10.2f %10.2f", c, d);
        System.out.println();
        System.out.printf("Row4:%10.2f %10.2f", d, e);
        System.out.println();
        System.out.printf("Row5:%10.2f %10.2f", e, a);




    }
}
