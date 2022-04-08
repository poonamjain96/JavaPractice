package Udemy;

import java.util.Scanner;

public class LeapYearCalculator {
    public static boolean isLeapYear (int year)
    {
        if(year>=1 && year<=9999)
        {

           if (year%4 ==0)
           {
               if(year%100 ==0)
               {
                   if(year%400 ==0)
                   {
                       return true;
                   }
               }
             else
                   return true;
           }

        }

        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
       int year = sc.nextInt();
        boolean leapYear = isLeapYear(year);
        System.out.println(leapYear);

    }
}
