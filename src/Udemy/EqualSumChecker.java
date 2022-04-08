package Udemy;

import java.util.Scanner;

public class EqualSumChecker {
    public static boolean hasEqualSum (int a, int b, int c)
    {
        if (c == (a+b))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        boolean result = hasEqualSum(a,b,c);
        System.out.println(result);
    }
}
