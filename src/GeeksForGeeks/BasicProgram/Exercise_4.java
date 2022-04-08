//Java Program to Swap Two Numbers using third variable
package GeeksForGeeks.BasicProgram;

import java.util.Scanner;

public class Exercise_4 {
    public static void swapnumber (int a, int b)
    {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a = "+a+ "\nb = "+b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two number a & b :");
        int a = s.nextInt();
        int b = s.nextInt();
        swapnumber(a, b);

    }
}
