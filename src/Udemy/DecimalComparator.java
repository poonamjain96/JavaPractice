package Udemy;

import java.util.Scanner;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b)
    {
        int a1 = (int) (a*1000);
        int b1 = (int) (b*1000);
        System.out.println(a);
        System.out.println(b);
        if(a1 == b1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
       boolean result =  areEqualByThreeDecimalPlaces(a,b);
        System.out.println(result);

    }
}
