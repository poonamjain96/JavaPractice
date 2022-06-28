package ApnaCollege;

import java.util.Scanner;

public class EvenOdd {
    public static void evenodd (int n)
    {
        if(n%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();
        evenodd(n);
    }
}
