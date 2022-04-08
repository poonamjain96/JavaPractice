//Java Program to Multiply two Floating-Point Numbers
package GeeksForGeeks.BasicProgram;

import java.util.Scanner;

public class Exercise_3 {
    public static void main (String[] args)
    {
        float a,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two number:");
        a = s.nextFloat();
        b = s.nextFloat();
        float result = (a*b);
        System.out.println("Result = " +result);


    }
}
