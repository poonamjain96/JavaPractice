package Udemy;

import java.util.Scanner;

public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b , int c)
    {
        if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19))
            return true;
        else
            return false;

    }
    public static boolean isTeen(int a)
    {
        if(a>=13 && a<=19)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three number :");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        boolean result = hasTeen(a,b,c);
        boolean result1 = isTeen(a);
        System.out.println(result);
        System.out.println(result1);
    }
}
